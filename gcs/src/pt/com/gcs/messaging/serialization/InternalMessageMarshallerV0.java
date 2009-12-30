package pt.com.gcs.messaging.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.caudexorigo.io.UnsynchronizedByteArrayInputStream;
import org.caudexorigo.io.UnsynchronizedByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.com.broker.types.NetBrokerMessage;
import pt.com.gcs.messaging.InternalMessage;
import pt.com.gcs.messaging.MessageType;

public class InternalMessageMarshallerV0 implements Codec<InternalMessage>
{

	private static Logger log = LoggerFactory.getLogger(InternalMessageMarshallerV0.class);
	
	@Override
	public byte[] marshall(InternalMessage internalMessage)  throws Throwable
	{
		UnsynchronizedByteArrayOutputStream bout = new UnsynchronizedByteArrayOutputStream();
		ObjectOutputStream oout = new ObjectOutputStream(bout);
		
		marshall(internalMessage, oout);	
	
		oout.flush();
		
		return bout.toByteArray();
	}
	
	public void marshall(InternalMessage internalMessage, ObjectOutputStream oout)  throws Throwable
	{
		
		log.warn("Using version ZERO to serialize InternalMessage objects. This shouldn't happen.");
		
		oout.writeUTF((internalMessage.getCorrelationId() != null) ? internalMessage.getCorrelationId() : "");
		
		oout.writeUTF((internalMessage.getCorrelationId() != null) ? internalMessage.getCorrelationId() : "");
		oout.writeUTF((internalMessage.getDestination() != null) ? internalMessage.getDestination() : "");
		oout.writeUTF((internalMessage.getId() != null) ? internalMessage.getId() : "");
		oout.writeUTF((internalMessage.getPublishingAgent() != null) ? internalMessage.getPublishingAgent() : "");
		oout.writeInt(internalMessage.getPriority());
		oout.writeUTF((internalMessage.getSourceApp() != null) ? internalMessage.getSourceApp() : "");
		oout.writeLong(internalMessage.getTimestamp());
		oout.writeLong(internalMessage.getExpiration());
		oout.writeInt(internalMessage.getType().getValue());
	
		internalMessage.getContent().write(oout);
	}

	@Override
	public InternalMessage unmarshall(byte[] data) throws Throwable
	{
		
		ObjectInputStream oIn;
		oIn = new ObjectInputStream(new UnsynchronizedByteArrayInputStream(data));
				
		return unmarshall(oIn);
	}
	
	public InternalMessage unmarshall(ObjectInputStream oIn) throws Throwable
	{
		
		InternalMessage message = new InternalMessage();
		
		String string = oIn.readUTF();
		if(string != null)
			message.setCorrelationId( string );
		
		string = oIn.readUTF();
		if(string != null)
			message.setDestination( string );


		string = oIn.readUTF();
		if(string != null)
			message.setId( string );

		string = oIn.readUTF();
		if(string != null)
			message.setPublishingAgent( string );

		message.setPriority(oIn.readInt());
		
		string = oIn.readUTF();
		if(string != null)
			message.setSourceApp( string );

		
		message.setTimestamp(oIn.readLong());
		
		message.setExpiration(oIn.readLong());

		message.setType(MessageType.lookup(oIn.readInt()));
		

		NetBrokerMessage content = NetBrokerMessage.read(oIn);

		message.setContent(content);
		
		message.setVersion(InternalMessage.CURRENT_VERSION);  // Set version to "current version" 
		
		return message;
	}

}
