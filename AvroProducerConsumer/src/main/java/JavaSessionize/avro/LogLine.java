/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package JavaSessionize.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LogLine extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogLine\",\"namespace\":\"JavaSessionize.avro\",\"fields\":[{\"name\":\"ip\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"referrer\",\"type\":\"string\"},{\"name\":\"useragent\",\"type\":\"string\"},{\"name\":\"sessionid\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence ip;
  @Deprecated public long timestamp;
  @Deprecated public java.lang.CharSequence url;
  @Deprecated public java.lang.CharSequence referrer;
  @Deprecated public java.lang.CharSequence useragent;
  @Deprecated public java.lang.Integer sessionid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public LogLine() {}

  /**
   * All-args constructor.
   */
  public LogLine(java.lang.CharSequence ip, java.lang.Long timestamp, java.lang.CharSequence url, java.lang.CharSequence referrer, java.lang.CharSequence useragent, java.lang.Integer sessionid) {
    this.ip = ip;
    this.timestamp = timestamp;
    this.url = url;
    this.referrer = referrer;
    this.useragent = useragent;
    this.sessionid = sessionid;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ip;
    case 1: return timestamp;
    case 2: return url;
    case 3: return referrer;
    case 4: return useragent;
    case 5: return sessionid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ip = (java.lang.CharSequence)value$; break;
    case 1: timestamp = (java.lang.Long)value$; break;
    case 2: url = (java.lang.CharSequence)value$; break;
    case 3: referrer = (java.lang.CharSequence)value$; break;
    case 4: useragent = (java.lang.CharSequence)value$; break;
    case 5: sessionid = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ip' field.
   */
  public java.lang.CharSequence getIp() {
    return ip;
  }

  /**
   * Sets the value of the 'ip' field.
   * @param value the value to set.
   */
  public void setIp(java.lang.CharSequence value) {
    this.ip = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /**
   * Gets the value of the 'referrer' field.
   */
  public java.lang.CharSequence getReferrer() {
    return referrer;
  }

  /**
   * Sets the value of the 'referrer' field.
   * @param value the value to set.
   */
  public void setReferrer(java.lang.CharSequence value) {
    this.referrer = value;
  }

  /**
   * Gets the value of the 'useragent' field.
   */
  public java.lang.CharSequence getUseragent() {
    return useragent;
  }

  /**
   * Sets the value of the 'useragent' field.
   * @param value the value to set.
   */
  public void setUseragent(java.lang.CharSequence value) {
    this.useragent = value;
  }

  /**
   * Gets the value of the 'sessionid' field.
   */
  public java.lang.Integer getSessionid() {
    return sessionid;
  }

  /**
   * Sets the value of the 'sessionid' field.
   * @param value the value to set.
   */
  public void setSessionid(java.lang.Integer value) {
    this.sessionid = value;
  }

  /** Creates a new LogLine RecordBuilder */
  public static JavaSessionize.avro.LogLine.Builder newBuilder() {
    return new JavaSessionize.avro.LogLine.Builder();
  }
  
  /** Creates a new LogLine RecordBuilder by copying an existing Builder */
  public static JavaSessionize.avro.LogLine.Builder newBuilder(JavaSessionize.avro.LogLine.Builder other) {
    return new JavaSessionize.avro.LogLine.Builder(other);
  }
  
  /** Creates a new LogLine RecordBuilder by copying an existing LogLine instance */
  public static JavaSessionize.avro.LogLine.Builder newBuilder(JavaSessionize.avro.LogLine other) {
    return new JavaSessionize.avro.LogLine.Builder(other);
  }
  
  /**
   * RecordBuilder for LogLine instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogLine>
    implements org.apache.avro.data.RecordBuilder<LogLine> {

    private java.lang.CharSequence ip;
    private long timestamp;
    private java.lang.CharSequence url;
    private java.lang.CharSequence referrer;
    private java.lang.CharSequence useragent;
    private java.lang.Integer sessionid;

    /** Creates a new Builder */
    private Builder() {
      super(JavaSessionize.avro.LogLine.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(JavaSessionize.avro.LogLine.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ip)) {
        this.ip = data().deepCopy(fields()[0].schema(), other.ip);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.referrer)) {
        this.referrer = data().deepCopy(fields()[3].schema(), other.referrer);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.useragent)) {
        this.useragent = data().deepCopy(fields()[4].schema(), other.useragent);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.sessionid)) {
        this.sessionid = data().deepCopy(fields()[5].schema(), other.sessionid);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LogLine instance */
    private Builder(JavaSessionize.avro.LogLine other) {
            super(JavaSessionize.avro.LogLine.SCHEMA$);
      if (isValidValue(fields()[0], other.ip)) {
        this.ip = data().deepCopy(fields()[0].schema(), other.ip);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[1].schema(), other.timestamp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.referrer)) {
        this.referrer = data().deepCopy(fields()[3].schema(), other.referrer);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.useragent)) {
        this.useragent = data().deepCopy(fields()[4].schema(), other.useragent);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.sessionid)) {
        this.sessionid = data().deepCopy(fields()[5].schema(), other.sessionid);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'ip' field */
    public java.lang.CharSequence getIp() {
      return ip;
    }
    
    /** Sets the value of the 'ip' field */
    public JavaSessionize.avro.LogLine.Builder setIp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ip = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'ip' field has been set */
    public boolean hasIp() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'ip' field */
    public JavaSessionize.avro.LogLine.Builder clearIp() {
      ip = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public JavaSessionize.avro.LogLine.Builder setTimestamp(long value) {
      validate(fields()[1], value);
      this.timestamp = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timestamp' field */
    public JavaSessionize.avro.LogLine.Builder clearTimestamp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'url' field */
    public java.lang.CharSequence getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public JavaSessionize.avro.LogLine.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.url = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'url' field */
    public JavaSessionize.avro.LogLine.Builder clearUrl() {
      url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'referrer' field */
    public java.lang.CharSequence getReferrer() {
      return referrer;
    }
    
    /** Sets the value of the 'referrer' field */
    public JavaSessionize.avro.LogLine.Builder setReferrer(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.referrer = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'referrer' field has been set */
    public boolean hasReferrer() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'referrer' field */
    public JavaSessionize.avro.LogLine.Builder clearReferrer() {
      referrer = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'useragent' field */
    public java.lang.CharSequence getUseragent() {
      return useragent;
    }
    
    /** Sets the value of the 'useragent' field */
    public JavaSessionize.avro.LogLine.Builder setUseragent(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.useragent = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'useragent' field has been set */
    public boolean hasUseragent() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'useragent' field */
    public JavaSessionize.avro.LogLine.Builder clearUseragent() {
      useragent = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'sessionid' field */
    public java.lang.Integer getSessionid() {
      return sessionid;
    }
    
    /** Sets the value of the 'sessionid' field */
    public JavaSessionize.avro.LogLine.Builder setSessionid(java.lang.Integer value) {
      validate(fields()[5], value);
      this.sessionid = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'sessionid' field has been set */
    public boolean hasSessionid() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'sessionid' field */
    public JavaSessionize.avro.LogLine.Builder clearSessionid() {
      sessionid = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public LogLine build() {
      try {
        LogLine record = new LogLine();
        record.ip = fieldSetFlags()[0] ? this.ip : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestamp = fieldSetFlags()[1] ? this.timestamp : (java.lang.Long) defaultValue(fields()[1]);
        record.url = fieldSetFlags()[2] ? this.url : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.referrer = fieldSetFlags()[3] ? this.referrer : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.useragent = fieldSetFlags()[4] ? this.useragent : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.sessionid = fieldSetFlags()[5] ? this.sessionid : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
