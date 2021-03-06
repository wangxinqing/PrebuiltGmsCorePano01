package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface Cache {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Entry {
        public List allResponseHeaders;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map responseHeaders = Collections.emptyMap();
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired() {
            return this.ttl < System.currentTimeMillis();
        }

        public boolean refreshNeeded() {
            return this.softTtl < System.currentTimeMillis();
        }
    }

    void clear();

    Entry get(String str);

    void initialize();

    void invalidate(String str, boolean z);

    void put(String str, Entry entry);

    void remove(String str);
}
