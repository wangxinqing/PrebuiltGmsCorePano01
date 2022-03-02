package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ljr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljr {
    private final Set a = new HashSet();

    public final synchronized void a(ljt ljt) {
        if (!c(ljt)) {
            this.a.add(ljt);
        } else {
            throw new IllegalStateException("This document is already open.");
        }
    }

    public final synchronized void b(ljt ljt) {
        this.a.remove(ljt);
    }

    public final synchronized boolean c(ljt ljt) {
        return this.a.contains(ljt);
    }
}
