package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.Map;

/* renamed from: jop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface jop extends IInterface {
    void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse);

    void a(Status status, Map map);

    void a(Status status, byte[] bArr);
}
