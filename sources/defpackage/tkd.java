package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tkd extends irg {
    public static final /* synthetic */ int i = 0;
    public final tku a;
    public final tlj b = new tlj();
    public final Map h = new ConcurrentHashMap();
    private final tgj j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tkd(Context context) {
        super(context, 54, new int[0]);
        tgj tgj = new tgj(2, tkb.a);
        this.j = tgj;
        this.a = new tku(context);
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        for (Map.Entry entry : this.h.entrySet()) {
            printWriter.write(String.format("%s\n", new Object[]{entry.getKey()}));
            ((tka) entry.getValue()).dump(fileDescriptor, printWriter, strArr);
            printWriter.write("\n");
        }
        this.a.a.a(printWriter);
        printWriter.flush();
    }

    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        Long l;
        String str;
        String str2 = getServiceRequest.d;
        Bundle bundle = getServiceRequest.g;
        if (bundle != null) {
            Long valueOf = Long.valueOf(bundle.getLong("clientId", -1));
            str = bundle.getString("zeroPartyIdentifier", (String) null);
            l = valueOf;
        } else {
            str = null;
            l = null;
        }
        tka tka = new tka(this.d, str2, str, l, this.b, this.a, this.j, new tkc(this, str2));
        this.h.put(str2, tka);
        hph hph = this.j.b;
        if (hph != null) {
            hph.d("NearbyConnectionsConnectionStatus").a(0);
        }
        isv.a(0, (IBinder) tka, (Bundle) null);
        ((anih) ((anih) tky.a.d()).a("tkd", "a", 97, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Client %s with package name %s and sdk version %s has connected.", (Object) l, (Object) str2, (Object) Integer.valueOf(getServiceRequest.c));
    }
}
