package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.nio.ByteBuffer;

/* renamed from: qln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qln {
    public static final Uri a = Uri.parse("content://instantapp-dev-manager");

    public static Uri a(int[] iArr) {
        ByteBuffer allocate = ByteBuffer.allocate(iArr.length * 4);
        allocate.asIntBuffer().put(iArr);
        return a.buildUpon().appendPath("resolveHashPrefixPhaseOne").appendQueryParameter("hashPrefixes", Base64.encodeToString(allocate.array(), 11)).build();
    }
}
