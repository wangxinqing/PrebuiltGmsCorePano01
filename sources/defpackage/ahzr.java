package defpackage;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppMessage;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: ahzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahzr extends ContextHubClientCallback {
    public final ContextHubManager a;
    public final aoru b;
    public boolean c = false;
    public ahzp d;
    public ContextHubClient e;

    public ahzr(ContextHubManager contextHubManager, aoru aoru) {
        this.a = contextHubManager;
        this.b = aoru;
    }

    public final void a() {
        this.b.execute(new ahzn(this));
    }

    public final void onHubReset(ContextHubClient contextHubClient) {
        this.a.queryNanoApps(this.e.getAttachedHub()).setOnCompleteListener(new ahzo(this), this.b);
    }

    public final void onMessageFromNanoApp(ContextHubClient contextHubClient, NanoAppMessage nanoAppMessage) {
        int i;
        aoay aoay;
        ahzp ahzp = this.d;
        if (nanoAppMessage.getMessageType() == 2147478647) {
            ahzc ahzc = (ahzc) ahzp;
            if (ahzc.d.contains(Long.valueOf(nanoAppMessage.getNanoAppId())) && nanoAppMessage.getMessageBody() != null) {
                byte[] messageBody = nanoAppMessage.getMessageBody();
                int i2 = 0;
                while (true) {
                    int length = messageBody.length;
                    if (i2 < length) {
                        int i3 = i2 + 2;
                        short s = length >= i3 ? ByteBuffer.wrap(messageBody, i2, 2).order(ByteOrder.LITTLE_ENDIAN).getShort() : -1;
                        if (s > 0 && length >= (i = i3 + s)) {
                            try {
                                aoay = (aoay) aucj.a((aucj) aoay.a, ByteBuffer.wrap(messageBody, i3, s));
                            } catch (auda e2) {
                                aoay = null;
                            }
                            if (aoay != null) {
                                aucd o = anui.p.o();
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                anui anui = (anui) o.b;
                                anui.b = 12;
                                int i4 = anui.a | 1;
                                anui.a = i4;
                                aoay.getClass();
                                anui.m = aoay;
                                anui.a = i4 | FragmentTransaction.TRANSIT_ENTER_MASK;
                                anui anui2 = (anui) o.i();
                                hol hol = ahzc.c;
                                if (hol != null) {
                                    hol.a((audx) anui2).b();
                                }
                                i2 = i;
                            } else if (Log.isLoggable("NanoAppLogging", 6)) {
                                long nanoAppId = nanoAppMessage.getNanoAppId();
                                StringBuilder sb = new StringBuilder(76);
                                sb.append("Failed to decode log message from ID: ");
                                sb.append(nanoAppId);
                                sb.append(" Aborting parsing.");
                                Log.e("NanoAppLogging", sb.toString());
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void onNanoAppEnabled(ContextHubClient contextHubClient, long j) {
        this.d.a(j);
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient, long j) {
        this.d.a(j);
    }

    public final void a(ahzp ahzp, Set set) {
        ContextHubManager contextHubManager;
        if (ahzp == null) {
            return;
        }
        if (set.isEmpty() || (contextHubManager = this.a) == null) {
            ahzp.a(false);
            return;
        }
        ahzp ahzp2 = this.d;
        if (ahzp2 == null) {
            this.c = true;
            this.d = ahzp;
            List<ContextHubInfo> contextHubs = contextHubManager.getContextHubs();
            ArrayList arrayList = new ArrayList(contextHubs);
            for (ContextHubInfo contextHubInfo : contextHubs) {
                this.a.queryNanoApps(contextHubInfo).setOnCompleteListener(new ahzq(this, contextHubInfo, arrayList, set), this.b);
            }
            return;
        }
        ahzp2.a(true);
    }
}
