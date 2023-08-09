package ethernetcontainer;

public class QueueUtilization {

    //ToDo QueNameType through queueNameType (queueName)
    //ToDo if List List Element Reference is needed implement it
    private String queueName;
    private Integer maxQueueLength;
    private Integer avgQueueLength;
    private String[] availableDropPrecedenceKindList; //ToDo
    private String[] availableSchedulingKindList; //ToDo
    private Integer[] supportedQueueDepthList; //ToDO
    private String[] availableDroppingBehaviorKindList; //ToDo
    private Boolean wredProfilePerDropPrecedenceIsAvailable;
}
