Delete this link at the end of the specification process:  
- [Roadmap to Specification](../../issues/1)

# MycomButler - MB

### Location
The MycomButler servers as a proxy to an existing software outside the MW SDN application layer.

### Description
The MycomButler is extracting performance data of radio interfaces and Ethernet interfaces from the MicroWaveDeviceInventory and puts them into a format that is accepted by Mycom.

(In principle, it is expected that applications and tools are using the REST interface to consume services and data from other applications. In case OSS-MYCOM would not be able to address the REST interface at the MicroWaveDeviceInventory (incl. participating at the OperationKey management) this converter could be provided.)  

### Relevance
The MycomButler supports embedding the MW SDN domain into the existing software landscape.

### Resources
- [Specification](./spec/)
- [TestSuite](./testing/)
- [Implementation](./server/)

### Comments
This application will be specified during [training for ApplicationOwners](https://gist.github.com/openBackhaul/5aabdbc90257b83b9fe7fc4da059d3cd).
