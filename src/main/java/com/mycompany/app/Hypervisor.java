package com.mycompany.app;
public class Hypervisor {
    public static enum HypervisorType {
        None, //for storage hosts
        XenServer,
        KVM,
        VMware,
        Hyperv,
        VirtualBox,
        Parralels,
        BareMetal,
        Simulator,
        Ovm,
        Ovm3,
        LXC,

        Any; /*If you don't care about the hypervisor type*/

        public static HypervisorType getType(String hypervisor) {
            if (hypervisor == null) {
                return HypervisorType.None;
            }
            if (hypervisor.equalsIgnoreCase("XenServer")) {
                return HypervisorType.XenServer;
            } else if (hypervisor.equalsIgnoreCase("KVM")) {
                return HypervisorType.KVM;
            } else if (hypervisor.equalsIgnoreCase("VMware")) {
                return HypervisorType.VMware;
            } else if (hypervisor.equalsIgnoreCase("Hyperv")) {
                return HypervisorType.Hyperv;
            } else if (hypervisor.equalsIgnoreCase("VirtualBox")) {
                return HypervisorType.VirtualBox;
            } else if (hypervisor.equalsIgnoreCase("Parralels")) {
                return HypervisorType.Parralels;
            } else if (hypervisor.equalsIgnoreCase("BareMetal")) {
                return HypervisorType.BareMetal;
            } else if (hypervisor.equalsIgnoreCase("Simulator")) {
                return HypervisorType.Simulator;
            } else if (hypervisor.equalsIgnoreCase("Ovm")) {
                return HypervisorType.Ovm;
            } else if (hypervisor.equalsIgnoreCase("LXC")) {
                return HypervisorType.LXC;
            } else if (hypervisor.equalsIgnoreCase("Any")) {
                return HypervisorType.Any;
            } else if (hypervisor.equalsIgnoreCase("Ovm3")) {
                return HypervisorType.Ovm3;
            } else {
                return HypervisorType.None;
            }
        }

    }
}