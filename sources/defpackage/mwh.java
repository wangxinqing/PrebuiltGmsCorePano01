package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: mwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwh extends oga {
    private final String a;
    private final byte[] l;
    private final boolean m;

    public mwh(Context context, HelpConfig helpConfig, aoru aoru, String str, byte[] bArr, boolean z) {
        super(context, helpConfig, aoru);
        this.a = str;
        this.l = bArr;
        this.m = z;
    }

    public static mwh a(Context context, HelpConfig helpConfig, aoru aoru, String str, byte[] bArr, boolean z) {
        return new mwh(context, helpConfig, aoru, str, bArr, z);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public final byte[] d() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return (int) axgy.a.a().z();
    }

    public final void onPreNetworkDispatch() {
        izj.b(3073);
    }

    public static boolean a(mwh mwh) {
        try {
            ogi k = mwh.k();
            if (!k.a()) {
                int i = k.a;
                StringBuilder sb = new StringBuilder(70);
                sb.append("Got non-success HTTP status code from submitting feedback: ");
                sb.append(i);
                Log.e("gF_feedbackSubmissionR", sb.toString());
            }
            return k.a();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("gF_feedbackSubmissionR", "Submitting feedback report failed.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axhb.a.a().a());
    }

    /* access modifiers changed from: protected */
    public final void a(Map map) {
        super.a(map);
        map.put("User-Agent", String.format("%s (%s %s)", new Object[]{"AndroidGoogleFeedback/1.1", Build.DEVICE, Build.ID}));
        map.put("Content-Type", "application/x-protobuf");
    }
}
