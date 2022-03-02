package defpackage;

import android.content.Intent;

/* renamed from: tyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tyv extends arwm {
    final /* synthetic */ tyw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tyv(tyw tyw, String str) {
        super(str);
        this.a = tyw;
    }

    public final void run() {
        jjg jjg = tsp.a;
        aymt.m();
        thp.a(this.a.c, new Intent("com.google.android.gms.discovery.fastpair.ACTION_HALF_SHEET_STATUS_CHANGE").putExtra("FINISHED_STATE", "DISMISS"));
    }
}
