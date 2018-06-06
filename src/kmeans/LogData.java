/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

/**
 *
 * @author Tess
 */
public class LogData {
    private String id ;
    private Float time;
    private String source;
    private Float destination;
    private char protocol;
    private int length;
    private char info;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the time
     */
    public Float getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Float time) {
        this.time = time;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the destination
     */
    public Float getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Float destination) {
        this.destination = destination;
    }

    /**
     * @return the protocol
     */
    public char getProtocol() {
        return protocol;
    }

    /**
     * @param protocol the protocol to set
     */
    public void setProtocol(char protocol) {
        this.protocol = protocol;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the info
     */
    public char getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(char info) {
        this.info = info;
    }
    
    
}
