package defpackage;

import android.net.Uri;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: afqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqa implements amqy {
    private final afkn a;

    public afqa(afkn afkn) {
        this.a = afkn;
    }

    public final Object a(Object obj) {
        afkn afkn = this.a;
        Uri uri = (Uri) obj;
        if (uri == null || (afkn.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return uri;
        }
        avlu avlu = afkn.j;
        if (avlu == null) {
            avlu = avlu.b;
        }
        return (!axsv.a.a().f() || avlu.a.size() == 0) ? uri : uri.buildUpon().encodedFragment(ahcx.a(avlu)).build();
    }
}
