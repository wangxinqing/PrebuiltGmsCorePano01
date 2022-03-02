package defpackage;

import android.content.Intent;

/* renamed from: ucj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ucj extends arwm {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ Intent d;
    final /* synthetic */ udb e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ucj(udb udb, String str, boolean z, String str2, boolean z2, Intent intent) {
        super(str);
        this.e = udb;
        this.a = z;
        this.b = str2;
        this.c = z2;
        this.d = intent;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS"));
    }
}
