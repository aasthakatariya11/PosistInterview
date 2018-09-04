package posist1;

import java.util.Date;
public class Genisis{

private int ownerId;
private float ownerValue;
private String ownerName;
private int nodeNumber;
private String nodeId;
private String referenceNodeId;
private String ChildReferenceNodeId;
private String genesisReferenceNodeId;
private String data;
private String HashValue;
private long timeStamp; 
//Block Constructor.

public String calculateHash() {
String input=ownerId + ownerValue +ownerName;
String calculatedHash = Hashing.applySha256(input);
return calculatedHash;
}
public Genisis(int ownerId,float ownerValue, String ownerName, int nodeNumber, String nodeId, String referenceNodeId,String ChildReferenceNodeId, String genesisReferenceNodeId, String data,long timeStamp){
	
	this.ownerId = ownerId;
	this.ownerValue = ownerValue;
	this.ownerName = ownerName;
        this.nodeNumber = nodeNumber;
        this.nodeId = nodeId;
        this.referenceNodeId = referenceNodeId;
        this.ChildReferenceNodeId = ChildReferenceNodeId;
	this.genesisReferenceNodeId = genesisReferenceNodeId;
	this.HashValue = HashValue;
	this.nodeNumber = nodeNumber;                       
	this.timeStamp = new Date().getTime();
        this.data = calculateHash();

	}
}
    

