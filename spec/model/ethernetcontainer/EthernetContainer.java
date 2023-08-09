package ethernetcontainer;

public class EthernetContainer {

    //ToDO mit Thorsten sprechen (logical-termination-point,layer-protocol)
    private String timeframe;
    private String logicalTerminationPoint;
    private String layerProtocol;
    private String periodEndTime;
    private String historyDataId;
    private Boolean suspectIntervalFlag;
    private Integer maxBytesPerSecondOutput;
    private Integer totalBytesOutput;
    private Integer timePeriod;
    private Integer totalFramesInput;
    private Integer totalFramesOutput;
    private Integer forwardedFramesInput;
    private Integer forwardedFramesOutput;
    private Integer unicastFramesInput;
    private Integer unicastFramesOutput;
    private Integer multicastFramesInput;
    private Integer multicastFramesOutput;
    private Integer broadcastFramesInput;
    private Integer broadcastFramesOutput;
    private Integer erroredFramesInput;
    private Integer erroredFramesOutput;
    private Integer droppedFramesInput;
    private Integer droppedFramesOutput;
    private QueueUtilization[] queueUtilizationList;

}
