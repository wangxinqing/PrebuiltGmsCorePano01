package defpackage;

import com.google.android.gms.smartdevice.magicwand.MagicWandChimeraActivity;

/* renamed from: acgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgb implements Runnable {
    final /* synthetic */ MagicWandChimeraActivity a;

    public acgb(MagicWandChimeraActivity magicWandChimeraActivity) {
        this.a = magicWandChimeraActivity;
    }

    public final void run() {
        this.a.finish();
    }
}
