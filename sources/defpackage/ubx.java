package defpackage;

import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Result;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants$Step;

/* renamed from: ubx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ubx implements aehx {
    private final udb a;
    private final String b;

    public ubx(udb udb, String str) {
        this.a = udb;
        this.b = str;
    }

    public final void a(int i, String str) {
        udb udb = this.a;
        String str2 = this.b;
        if (i - 1 != 1) {
            aein.a(udb.e, str2, BroadcastConstants$Step.FINISHED, BroadcastConstants$Result.FAILURE);
        } else {
            aein.a(udb.e, str2, BroadcastConstants$Step.FINISHED, BroadcastConstants$Result.SUCCESS);
        }
    }
}
