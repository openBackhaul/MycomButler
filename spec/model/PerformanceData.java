import airinterface.AirInterface;
import ethernetcontainer.EthernetContainer;
import macinterface.MacInterface;

public class PerformanceData {

    private String vendor;
    private String nodeID;
    private String lastUpdate;
    private AirInterface[] airInterfaceData15min;
    private AirInterface[] airInterfaceData24h;
    private EthernetContainer[] ethernetContainerData15min;
    private EthernetContainer[] ethernetContainerData24h;
    private MacInterface[] macInterfaceData15min;
    private MacInterface[] macInterfaceData24h;
}
