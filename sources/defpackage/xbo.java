package defpackage;

import android.content.res.Resources;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class xbo {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Resources b;

    public xbo(Resources resources) {
        this.b = resources;
    }

    /* access modifiers changed from: protected */
    public abstract String a(Resources resources, int i);
}
