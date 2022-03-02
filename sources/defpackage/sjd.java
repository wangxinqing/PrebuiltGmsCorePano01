package defpackage;

import android.os.IInterface;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* renamed from: sjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface sjd extends IInterface {
    void a(sjb sjb, SyncRequest syncRequest, CallerInfo callerInfo);

    void a(sjb sjb, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo);
}
