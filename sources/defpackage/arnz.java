package defpackage;

import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubMessage;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: arnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arnz extends ContextHubManager.Callback {
    public final AtomicInteger a = new AtomicInteger();
    public final ThreadPoolExecutor b;
    public final ThreadPoolExecutor c;
    protected final ThreadPoolExecutor d;
    public final aroi e = new aroi();
    final aroo f = new aroo();
    public final int g;
    public final ContextHubManager h;
    final arny i;
    public final String j;
    public final Object k = new Object();
    public volatile aroq l;
    public volatile arot m;

    public arnz(int i2, ContextHubManager contextHubManager, arny arny, String str) {
        if (i2 > 0) {
            this.g = i2;
            this.h = contextHubManager;
            this.i = arny;
            this.j = str;
            this.b = new jfz(1, 9);
            this.c = new jfz(1, 9);
            this.d = new jfz(1, 9);
            return;
        }
        throw new IllegalArgumentException("'maxFragmentLengthBytes' must be a non-zero positive number");
    }

    public final void onMessageReceipt(int i2, int i3, ContextHubMessage contextHubMessage) {
        int msgType = contextHubMessage.getMsgType();
        byte[] data = contextHubMessage.getData();
        synchronized (this.e) {
            this.e.a(msgType, i3);
        }
        if (i3 == -1) {
            contextHubMessage.getVersion();
            this.d.execute(new arnx(this, i2, msgType, data));
        } else if (msgType != 1025) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Dropping message due to unknown messageType=");
            sb.append(msgType);
            sb.toString();
        } else if (data != null && data.length > 0) {
            this.d.execute(new arnw(this, i2, i3, data));
        }
    }
}
