package defpackage;

import android.os.IInterface;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import java.util.Map;

/* renamed from: lzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface lzz extends IInterface {
    DroidGuardInitReply a(String str, DroidGuardResultsRequest droidGuardResultsRequest);

    void a(String str);

    byte[] a(Map map);

    void b();
}
