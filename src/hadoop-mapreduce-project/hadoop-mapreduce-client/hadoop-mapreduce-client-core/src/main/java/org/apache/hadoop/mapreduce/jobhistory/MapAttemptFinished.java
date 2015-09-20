/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MapAttemptFinished extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MapAttemptFinished\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":\"string\"},{\"name\":\"mapFinishTime\",\"type\":\"long\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"hostname\",\"type\":\"string\"},{\"name\":\"port\",\"type\":\"int\"},{\"name\":\"rackname\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":{\"type\":\"record\",\"name\":\"JhCounters\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounterGroup\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounter\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"long\"}]}}}]}}}]}},{\"name\":\"clockSplits\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"cpuUsages\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"vMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"physMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence taskid;
  @Deprecated public java.lang.CharSequence attemptId;
  @Deprecated public java.lang.CharSequence taskType;
  @Deprecated public java.lang.CharSequence taskStatus;
  @Deprecated public long mapFinishTime;
  @Deprecated public long finishTime;
  @Deprecated public java.lang.CharSequence hostname;
  @Deprecated public int port;
  @Deprecated public java.lang.CharSequence rackname;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public org.apache.hadoop.mapreduce.jobhistory.JhCounters counters;
  @Deprecated public java.util.List<java.lang.Integer> clockSplits;
  @Deprecated public java.util.List<java.lang.Integer> cpuUsages;
  @Deprecated public java.util.List<java.lang.Integer> vMemKbytes;
  @Deprecated public java.util.List<java.lang.Integer> physMemKbytes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public MapAttemptFinished() {}

  /**
   * All-args constructor.
   */
  public MapAttemptFinished(java.lang.CharSequence taskid, java.lang.CharSequence attemptId, java.lang.CharSequence taskType, java.lang.CharSequence taskStatus, java.lang.Long mapFinishTime, java.lang.Long finishTime, java.lang.CharSequence hostname, java.lang.Integer port, java.lang.CharSequence rackname, java.lang.CharSequence state, org.apache.hadoop.mapreduce.jobhistory.JhCounters counters, java.util.List<java.lang.Integer> clockSplits, java.util.List<java.lang.Integer> cpuUsages, java.util.List<java.lang.Integer> vMemKbytes, java.util.List<java.lang.Integer> physMemKbytes) {
    this.taskid = taskid;
    this.attemptId = attemptId;
    this.taskType = taskType;
    this.taskStatus = taskStatus;
    this.mapFinishTime = mapFinishTime;
    this.finishTime = finishTime;
    this.hostname = hostname;
    this.port = port;
    this.rackname = rackname;
    this.state = state;
    this.counters = counters;
    this.clockSplits = clockSplits;
    this.cpuUsages = cpuUsages;
    this.vMemKbytes = vMemKbytes;
    this.physMemKbytes = physMemKbytes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return taskid;
    case 1: return attemptId;
    case 2: return taskType;
    case 3: return taskStatus;
    case 4: return mapFinishTime;
    case 5: return finishTime;
    case 6: return hostname;
    case 7: return port;
    case 8: return rackname;
    case 9: return state;
    case 10: return counters;
    case 11: return clockSplits;
    case 12: return cpuUsages;
    case 13: return vMemKbytes;
    case 14: return physMemKbytes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: taskid = (java.lang.CharSequence)value$; break;
    case 1: attemptId = (java.lang.CharSequence)value$; break;
    case 2: taskType = (java.lang.CharSequence)value$; break;
    case 3: taskStatus = (java.lang.CharSequence)value$; break;
    case 4: mapFinishTime = (java.lang.Long)value$; break;
    case 5: finishTime = (java.lang.Long)value$; break;
    case 6: hostname = (java.lang.CharSequence)value$; break;
    case 7: port = (java.lang.Integer)value$; break;
    case 8: rackname = (java.lang.CharSequence)value$; break;
    case 9: state = (java.lang.CharSequence)value$; break;
    case 10: counters = (org.apache.hadoop.mapreduce.jobhistory.JhCounters)value$; break;
    case 11: clockSplits = (java.util.List<java.lang.Integer>)value$; break;
    case 12: cpuUsages = (java.util.List<java.lang.Integer>)value$; break;
    case 13: vMemKbytes = (java.util.List<java.lang.Integer>)value$; break;
    case 14: physMemKbytes = (java.util.List<java.lang.Integer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'taskid' field.
   */
  public java.lang.CharSequence getTaskid() {
    return taskid;
  }

  /**
   * Sets the value of the 'taskid' field.
   * @param value the value to set.
   */
  public void setTaskid(java.lang.CharSequence value) {
    this.taskid = value;
  }

  /**
   * Gets the value of the 'attemptId' field.
   */
  public java.lang.CharSequence getAttemptId() {
    return attemptId;
  }

  /**
   * Sets the value of the 'attemptId' field.
   * @param value the value to set.
   */
  public void setAttemptId(java.lang.CharSequence value) {
    this.attemptId = value;
  }

  /**
   * Gets the value of the 'taskType' field.
   */
  public java.lang.CharSequence getTaskType() {
    return taskType;
  }

  /**
   * Sets the value of the 'taskType' field.
   * @param value the value to set.
   */
  public void setTaskType(java.lang.CharSequence value) {
    this.taskType = value;
  }

  /**
   * Gets the value of the 'taskStatus' field.
   */
  public java.lang.CharSequence getTaskStatus() {
    return taskStatus;
  }

  /**
   * Sets the value of the 'taskStatus' field.
   * @param value the value to set.
   */
  public void setTaskStatus(java.lang.CharSequence value) {
    this.taskStatus = value;
  }

  /**
   * Gets the value of the 'mapFinishTime' field.
   */
  public java.lang.Long getMapFinishTime() {
    return mapFinishTime;
  }

  /**
   * Sets the value of the 'mapFinishTime' field.
   * @param value the value to set.
   */
  public void setMapFinishTime(java.lang.Long value) {
    this.mapFinishTime = value;
  }

  /**
   * Gets the value of the 'finishTime' field.
   */
  public java.lang.Long getFinishTime() {
    return finishTime;
  }

  /**
   * Sets the value of the 'finishTime' field.
   * @param value the value to set.
   */
  public void setFinishTime(java.lang.Long value) {
    this.finishTime = value;
  }

  /**
   * Gets the value of the 'hostname' field.
   */
  public java.lang.CharSequence getHostname() {
    return hostname;
  }

  /**
   * Sets the value of the 'hostname' field.
   * @param value the value to set.
   */
  public void setHostname(java.lang.CharSequence value) {
    this.hostname = value;
  }

  /**
   * Gets the value of the 'port' field.
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Sets the value of the 'port' field.
   * @param value the value to set.
   */
  public void setPort(java.lang.Integer value) {
    this.port = value;
  }

  /**
   * Gets the value of the 'rackname' field.
   */
  public java.lang.CharSequence getRackname() {
    return rackname;
  }

  /**
   * Sets the value of the 'rackname' field.
   * @param value the value to set.
   */
  public void setRackname(java.lang.CharSequence value) {
    this.rackname = value;
  }

  /**
   * Gets the value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'counters' field.
   */
  public org.apache.hadoop.mapreduce.jobhistory.JhCounters getCounters() {
    return counters;
  }

  /**
   * Sets the value of the 'counters' field.
   * @param value the value to set.
   */
  public void setCounters(org.apache.hadoop.mapreduce.jobhistory.JhCounters value) {
    this.counters = value;
  }

  /**
   * Gets the value of the 'clockSplits' field.
   */
  public java.util.List<java.lang.Integer> getClockSplits() {
    return clockSplits;
  }

  /**
   * Sets the value of the 'clockSplits' field.
   * @param value the value to set.
   */
  public void setClockSplits(java.util.List<java.lang.Integer> value) {
    this.clockSplits = value;
  }

  /**
   * Gets the value of the 'cpuUsages' field.
   */
  public java.util.List<java.lang.Integer> getCpuUsages() {
    return cpuUsages;
  }

  /**
   * Sets the value of the 'cpuUsages' field.
   * @param value the value to set.
   */
  public void setCpuUsages(java.util.List<java.lang.Integer> value) {
    this.cpuUsages = value;
  }

  /**
   * Gets the value of the 'vMemKbytes' field.
   */
  public java.util.List<java.lang.Integer> getVMemKbytes() {
    return vMemKbytes;
  }

  /**
   * Sets the value of the 'vMemKbytes' field.
   * @param value the value to set.
   */
  public void setVMemKbytes(java.util.List<java.lang.Integer> value) {
    this.vMemKbytes = value;
  }

  /**
   * Gets the value of the 'physMemKbytes' field.
   */
  public java.util.List<java.lang.Integer> getPhysMemKbytes() {
    return physMemKbytes;
  }

  /**
   * Sets the value of the 'physMemKbytes' field.
   * @param value the value to set.
   */
  public void setPhysMemKbytes(java.util.List<java.lang.Integer> value) {
    this.physMemKbytes = value;
  }

  /** Creates a new MapAttemptFinished RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder();
  }
  
  /** Creates a new MapAttemptFinished RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder(other);
  }
  
  /** Creates a new MapAttemptFinished RecordBuilder by copying an existing MapAttemptFinished instance */
  public static org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished other) {
    return new org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder(other);
  }
  
  /**
   * RecordBuilder for MapAttemptFinished instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MapAttemptFinished>
    implements org.apache.avro.data.RecordBuilder<MapAttemptFinished> {

    private java.lang.CharSequence taskid;
    private java.lang.CharSequence attemptId;
    private java.lang.CharSequence taskType;
    private java.lang.CharSequence taskStatus;
    private long mapFinishTime;
    private long finishTime;
    private java.lang.CharSequence hostname;
    private int port;
    private java.lang.CharSequence rackname;
    private java.lang.CharSequence state;
    private org.apache.hadoop.mapreduce.jobhistory.JhCounters counters;
    private org.apache.hadoop.mapreduce.jobhistory.JhCounters.Builder countersBuilder;
    private java.util.List<java.lang.Integer> clockSplits;
    private java.util.List<java.lang.Integer> cpuUsages;
    private java.util.List<java.lang.Integer> vMemKbytes;
    private java.util.List<java.lang.Integer> physMemKbytes;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.taskid)) {
        this.taskid = data().deepCopy(fields()[0].schema(), other.taskid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attemptId)) {
        this.attemptId = data().deepCopy(fields()[1].schema(), other.attemptId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.taskType)) {
        this.taskType = data().deepCopy(fields()[2].schema(), other.taskType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taskStatus)) {
        this.taskStatus = data().deepCopy(fields()[3].schema(), other.taskStatus);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.mapFinishTime)) {
        this.mapFinishTime = data().deepCopy(fields()[4].schema(), other.mapFinishTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.finishTime)) {
        this.finishTime = data().deepCopy(fields()[5].schema(), other.finishTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.hostname)) {
        this.hostname = data().deepCopy(fields()[6].schema(), other.hostname);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.port)) {
        this.port = data().deepCopy(fields()[7].schema(), other.port);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.rackname)) {
        this.rackname = data().deepCopy(fields()[8].schema(), other.rackname);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.state)) {
        this.state = data().deepCopy(fields()[9].schema(), other.state);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.counters)) {
        this.counters = data().deepCopy(fields()[10].schema(), other.counters);
        fieldSetFlags()[10] = true;
      }
      if (other.hasCountersBuilder()) {
        this.countersBuilder = org.apache.hadoop.mapreduce.jobhistory.JhCounters.newBuilder(other.getCountersBuilder());
      }
      if (isValidValue(fields()[11], other.clockSplits)) {
        this.clockSplits = data().deepCopy(fields()[11].schema(), other.clockSplits);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.cpuUsages)) {
        this.cpuUsages = data().deepCopy(fields()[12].schema(), other.cpuUsages);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.vMemKbytes)) {
        this.vMemKbytes = data().deepCopy(fields()[13].schema(), other.vMemKbytes);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.physMemKbytes)) {
        this.physMemKbytes = data().deepCopy(fields()[14].schema(), other.physMemKbytes);
        fieldSetFlags()[14] = true;
      }
    }
    
    /** Creates a Builder by copying an existing MapAttemptFinished instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished other) {
            super(org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.SCHEMA$);
      if (isValidValue(fields()[0], other.taskid)) {
        this.taskid = data().deepCopy(fields()[0].schema(), other.taskid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attemptId)) {
        this.attemptId = data().deepCopy(fields()[1].schema(), other.attemptId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.taskType)) {
        this.taskType = data().deepCopy(fields()[2].schema(), other.taskType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taskStatus)) {
        this.taskStatus = data().deepCopy(fields()[3].schema(), other.taskStatus);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.mapFinishTime)) {
        this.mapFinishTime = data().deepCopy(fields()[4].schema(), other.mapFinishTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.finishTime)) {
        this.finishTime = data().deepCopy(fields()[5].schema(), other.finishTime);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.hostname)) {
        this.hostname = data().deepCopy(fields()[6].schema(), other.hostname);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.port)) {
        this.port = data().deepCopy(fields()[7].schema(), other.port);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.rackname)) {
        this.rackname = data().deepCopy(fields()[8].schema(), other.rackname);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.state)) {
        this.state = data().deepCopy(fields()[9].schema(), other.state);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.counters)) {
        this.counters = data().deepCopy(fields()[10].schema(), other.counters);
        fieldSetFlags()[10] = true;
      }
      this.countersBuilder = null;
      if (isValidValue(fields()[11], other.clockSplits)) {
        this.clockSplits = data().deepCopy(fields()[11].schema(), other.clockSplits);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.cpuUsages)) {
        this.cpuUsages = data().deepCopy(fields()[12].schema(), other.cpuUsages);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.vMemKbytes)) {
        this.vMemKbytes = data().deepCopy(fields()[13].schema(), other.vMemKbytes);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.physMemKbytes)) {
        this.physMemKbytes = data().deepCopy(fields()[14].schema(), other.physMemKbytes);
        fieldSetFlags()[14] = true;
      }
    }

    /**
      * Gets the value of the 'taskid' field.
      */
    public java.lang.CharSequence getTaskid() {
      return taskid;
    }

    /**
      * Sets the value of the 'taskid' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setTaskid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.taskid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'taskid' field has been set.
      */
    public boolean hasTaskid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'taskid' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearTaskid() {
      taskid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'attemptId' field.
      */
    public java.lang.CharSequence getAttemptId() {
      return attemptId;
    }

    /**
      * Sets the value of the 'attemptId' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setAttemptId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.attemptId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'attemptId' field has been set.
      */
    public boolean hasAttemptId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'attemptId' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearAttemptId() {
      attemptId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'taskType' field.
      */
    public java.lang.CharSequence getTaskType() {
      return taskType;
    }

    /**
      * Sets the value of the 'taskType' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setTaskType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.taskType = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'taskType' field has been set.
      */
    public boolean hasTaskType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'taskType' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearTaskType() {
      taskType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'taskStatus' field.
      */
    public java.lang.CharSequence getTaskStatus() {
      return taskStatus;
    }

    /**
      * Sets the value of the 'taskStatus' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setTaskStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.taskStatus = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'taskStatus' field has been set.
      */
    public boolean hasTaskStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'taskStatus' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearTaskStatus() {
      taskStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'mapFinishTime' field.
      */
    public java.lang.Long getMapFinishTime() {
      return mapFinishTime;
    }

    /**
      * Sets the value of the 'mapFinishTime' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setMapFinishTime(long value) {
      validate(fields()[4], value);
      this.mapFinishTime = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'mapFinishTime' field has been set.
      */
    public boolean hasMapFinishTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'mapFinishTime' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearMapFinishTime() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'finishTime' field.
      */
    public java.lang.Long getFinishTime() {
      return finishTime;
    }

    /**
      * Sets the value of the 'finishTime' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setFinishTime(long value) {
      validate(fields()[5], value);
      this.finishTime = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'finishTime' field has been set.
      */
    public boolean hasFinishTime() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'finishTime' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearFinishTime() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'hostname' field.
      */
    public java.lang.CharSequence getHostname() {
      return hostname;
    }

    /**
      * Sets the value of the 'hostname' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setHostname(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.hostname = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'hostname' field has been set.
      */
    public boolean hasHostname() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'hostname' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearHostname() {
      hostname = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'port' field.
      */
    public java.lang.Integer getPort() {
      return port;
    }

    /**
      * Sets the value of the 'port' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setPort(int value) {
      validate(fields()[7], value);
      this.port = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'port' field has been set.
      */
    public boolean hasPort() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'port' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearPort() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'rackname' field.
      */
    public java.lang.CharSequence getRackname() {
      return rackname;
    }

    /**
      * Sets the value of the 'rackname' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setRackname(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.rackname = value;
      fieldSetFlags()[8] = true;
      return this; 
    }

    /**
      * Checks whether the 'rackname' field has been set.
      */
    public boolean hasRackname() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'rackname' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearRackname() {
      rackname = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setState(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.state = value;
      fieldSetFlags()[9] = true;
      return this; 
    }

    /**
      * Checks whether the 'state' field has been set.
      */
    public boolean hasState() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'state' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearState() {
      state = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'counters' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounters getCounters() {
      return counters;
    }

    /**
      * Sets the value of the 'counters' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setCounters(org.apache.hadoop.mapreduce.jobhistory.JhCounters value) {
      validate(fields()[10], value);
      this.countersBuilder = null;
      this.counters = value;
      fieldSetFlags()[10] = true;
      return this; 
    }

    /**
      * Checks whether the 'counters' field has been set.
      */
    public boolean hasCounters() {
      return fieldSetFlags()[10];
    }

    /**
     * Gets the Builder instance for the 'counters' field and creates one if it doesn't exist yet.
     */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounters.Builder getCountersBuilder() {
      if (countersBuilder == null) {
        if (hasCounters()) {
          setCountersBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounters.newBuilder(counters));
        } else {
          setCountersBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounters.newBuilder());
        }
      }
      return countersBuilder;
    }

    /**
     * Sets the Builder instance for the 'counters' field
     */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setCountersBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounters.Builder value) {
      clearCounters();
      countersBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'counters' field has an active Builder instance
     */
    public boolean hasCountersBuilder() {
      return countersBuilder != null;
    }

    /**
      * Clears the value of the 'counters' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearCounters() {
      counters = null;
      countersBuilder = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'clockSplits' field.
      */
    public java.util.List<java.lang.Integer> getClockSplits() {
      return clockSplits;
    }

    /**
      * Sets the value of the 'clockSplits' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setClockSplits(java.util.List<java.lang.Integer> value) {
      validate(fields()[11], value);
      this.clockSplits = value;
      fieldSetFlags()[11] = true;
      return this; 
    }

    /**
      * Checks whether the 'clockSplits' field has been set.
      */
    public boolean hasClockSplits() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'clockSplits' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearClockSplits() {
      clockSplits = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'cpuUsages' field.
      */
    public java.util.List<java.lang.Integer> getCpuUsages() {
      return cpuUsages;
    }

    /**
      * Sets the value of the 'cpuUsages' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setCpuUsages(java.util.List<java.lang.Integer> value) {
      validate(fields()[12], value);
      this.cpuUsages = value;
      fieldSetFlags()[12] = true;
      return this; 
    }

    /**
      * Checks whether the 'cpuUsages' field has been set.
      */
    public boolean hasCpuUsages() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'cpuUsages' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearCpuUsages() {
      cpuUsages = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'vMemKbytes' field.
      */
    public java.util.List<java.lang.Integer> getVMemKbytes() {
      return vMemKbytes;
    }

    /**
      * Sets the value of the 'vMemKbytes' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setVMemKbytes(java.util.List<java.lang.Integer> value) {
      validate(fields()[13], value);
      this.vMemKbytes = value;
      fieldSetFlags()[13] = true;
      return this; 
    }

    /**
      * Checks whether the 'vMemKbytes' field has been set.
      */
    public boolean hasVMemKbytes() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'vMemKbytes' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearVMemKbytes() {
      vMemKbytes = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /**
      * Gets the value of the 'physMemKbytes' field.
      */
    public java.util.List<java.lang.Integer> getPhysMemKbytes() {
      return physMemKbytes;
    }

    /**
      * Sets the value of the 'physMemKbytes' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder setPhysMemKbytes(java.util.List<java.lang.Integer> value) {
      validate(fields()[14], value);
      this.physMemKbytes = value;
      fieldSetFlags()[14] = true;
      return this; 
    }

    /**
      * Checks whether the 'physMemKbytes' field has been set.
      */
    public boolean hasPhysMemKbytes() {
      return fieldSetFlags()[14];
    }


    /**
      * Clears the value of the 'physMemKbytes' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.MapAttemptFinished.Builder clearPhysMemKbytes() {
      physMemKbytes = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    @Override
    public MapAttemptFinished build() {
      try {
        MapAttemptFinished record = new MapAttemptFinished();
        record.taskid = fieldSetFlags()[0] ? this.taskid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.attemptId = fieldSetFlags()[1] ? this.attemptId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.taskType = fieldSetFlags()[2] ? this.taskType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.taskStatus = fieldSetFlags()[3] ? this.taskStatus : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.mapFinishTime = fieldSetFlags()[4] ? this.mapFinishTime : (java.lang.Long) defaultValue(fields()[4]);
        record.finishTime = fieldSetFlags()[5] ? this.finishTime : (java.lang.Long) defaultValue(fields()[5]);
        record.hostname = fieldSetFlags()[6] ? this.hostname : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.port = fieldSetFlags()[7] ? this.port : (java.lang.Integer) defaultValue(fields()[7]);
        record.rackname = fieldSetFlags()[8] ? this.rackname : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.state = fieldSetFlags()[9] ? this.state : (java.lang.CharSequence) defaultValue(fields()[9]);
        if (countersBuilder != null) {
          record.counters = this.countersBuilder.build();
        } else {
          record.counters = fieldSetFlags()[10] ? this.counters : (org.apache.hadoop.mapreduce.jobhistory.JhCounters) defaultValue(fields()[10]);
        }
        record.clockSplits = fieldSetFlags()[11] ? this.clockSplits : (java.util.List<java.lang.Integer>) defaultValue(fields()[11]);
        record.cpuUsages = fieldSetFlags()[12] ? this.cpuUsages : (java.util.List<java.lang.Integer>) defaultValue(fields()[12]);
        record.vMemKbytes = fieldSetFlags()[13] ? this.vMemKbytes : (java.util.List<java.lang.Integer>) defaultValue(fields()[13]);
        record.physMemKbytes = fieldSetFlags()[14] ? this.physMemKbytes : (java.util.List<java.lang.Integer>) defaultValue(fields()[14]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}