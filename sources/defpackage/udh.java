package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;

/* renamed from: udh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udh {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public Bitmap g;
    public Intent h;
    public Intent i;
    public boolean j;
    public String k;
    public boolean l;
    public boolean m;
    private boolean n;

    public final udi a() {
        String str = this.a;
        if (str != null) {
            Intent intent = this.h;
            if (intent != null) {
                Intent intent2 = this.i;
                if (intent2 != null) {
                    return new udi(str, this.b, this.c, this.d, this.e, this.f, this.g, intent, intent2, this.j, this.k, this.n, this.l, this.m);
                }
                throw new IllegalStateException("DiscoveryNotificationItem.dismissIntent cannot be null");
            }
            throw new IllegalStateException("DiscoveryNotificationItem.actionIntent cannot be null");
        }
        throw new IllegalStateException("DiscoveryNotificationItem.notificationId cannot be null");
    }

    public final void b() {
        this.n = true;
    }
}
