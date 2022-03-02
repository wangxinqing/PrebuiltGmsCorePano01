package defpackage;

import android.content.Intent;
import java.util.List;

/* renamed from: bmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bmh {
    public final int a;
    public final boolean b;
    public final Intent c;
    public final List d;
    public Intent e;
    public Intent f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public boolean k;
    final /* synthetic */ bml l;

    public bmh(bml bml, Intent intent, int i2, int i3, List list) {
        this.l = bml;
        this.c = intent;
        this.d = !bml.m ? null : list;
        this.e = intent;
        this.f = null;
        this.b = "com.google.android.chimera.container.IntentOperationService.KEEPALIVE".equals(intent.getAction());
        this.a = i2;
        this.g = i3;
        this.h = 1;
        this.i = false;
        this.j = null;
        this.k = false;
    }

    public final String a() {
        Intent intent;
        Intent intent2 = this.e;
        if (intent2 == null || (intent = (Intent) intent2.getParcelableExtra("intent")) == null) {
            return null;
        }
        this.j = this.e.getStringExtra("moduleid");
        this.e = intent;
        return intent.getAction();
    }

    public final void b() {
        int i2 = this.h - 1;
        this.h = i2;
        if (i2 == 0) {
            this.e = null;
            amtf.a(this.f == null);
            this.l.l.a(this);
        }
    }
}
