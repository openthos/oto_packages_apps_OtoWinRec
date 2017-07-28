package com.openthos.windowsrecovery;

/**
 * Created by root on 5/8/17.
 */

public class Volume {
    private String fDisk; // /dev/block/sdb
    private String block; // 3
    private long size;
    private long sectorStart;
    private long sectorEnd;
    private String useType;
    private String fsType;
    private String info;

    public long getSectorStart() {
        return sectorStart;
    }
    public long getSectorEnd() {
        return sectorEnd;
    }

    public void setSectorStart(long sectorNum) {
        this.sectorStart = sectorNum;
    }
    public void setSectorEnd(long sectorNum) {
        this.sectorEnd = sectorNum;
    }

    public String getUseType() {
        return useType;
    }
    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getFsType() {
        return fsType;
    }
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }

    public String getfDisk() {
        return fDisk;
    }
    public String getBlock() {
        return block;
    }

    public void setfDisk(String disk) {
        this.fDisk = disk;
    }
    public void setBlock(String block) {
        this.block = block;
    }
}
