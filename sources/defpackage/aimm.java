package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;

/* renamed from: aimm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimm extends qvv {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimm(aing aing, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.a = aing;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        aing aing = this.a;
        int i = aing.E;
        aucd aucd = aing.D;
        if (aucd != null) {
            boolean b = aing.x.b();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoal aoal = (aoal) aucd.b;
            aoal aoal2 = aoal.g;
            aoal.a |= 1;
            aoal.b = b;
            aing aing2 = this.a;
            aucd aucd2 = aing2.D;
            boolean a2 = aing2.x.a();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aoal aoal3 = (aoal) aucd2.b;
            aoal3.a |= 2;
            aoal3.c = a2;
        }
        aing aing3 = this.a;
        synchronized (aing3.k) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                aikq.a("GeofencerStateMachine", "sendQueryLocationOptIn");
            }
            aing3.d(1);
        }
    }
}
