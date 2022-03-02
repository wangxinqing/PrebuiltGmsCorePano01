package com.google.android.ads.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class w {
    private final Map a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}
