package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

/* renamed from: uem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uem extends ugw {
    private final Context a;
    private final ige b;
    private final Map c = new nz();

    public uem(Context context, ige ige) {
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) ige);
        this.b = ige;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        for (Map.Entry entry : this.c.entrySet()) {
            this.b.a(new uek(((uel) entry.getKey()).a, (PayloadTransferUpdate) entry.getValue()));
        }
        this.c.clear();
    }

    public final synchronized void a(OnPayloadReceivedParams onPayloadReceivedParams) {
        Context context = this.a;
        ParcelablePayload parcelablePayload = onPayloadReceivedParams.b;
        long j = parcelablePayload.a;
        int i = parcelablePayload.b;
        tjc tjc = null;
        if (i == 1) {
            tjc = tjc.a(parcelablePayload.c, j);
        } else if (i == 2) {
            String str = parcelablePayload.e;
            Uri uri = parcelablePayload.h;
            if (str == null || uri == null) {
                tjc = tjc.a(tja.a(parcelablePayload.d), j);
            } else {
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                    File file = new File(str);
                    long j2 = parcelablePayload.f;
                    iva.a((Object) file, (Object) "Cannot create Payload.File from null java.io.File.");
                    iva.a((Object) openFileDescriptor, (Object) "Cannot create Payload.File from null ParcelFileDescriptor.");
                    iva.a((Object) uri, (Object) "Cannot create Payload.File from null Uri");
                    tjc = tjc.a(new tja(file, openFileDescriptor, j2), j);
                } catch (FileNotFoundException e) {
                    Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", new Object[]{uri, str}), e);
                }
            }
        } else if (i != 3) {
            Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", new Object[]{Long.valueOf(j), Integer.valueOf(parcelablePayload.b)}));
        } else {
            ParcelFileDescriptor parcelFileDescriptor = parcelablePayload.d;
            iva.a((Object) parcelFileDescriptor, (Object) "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            tjc = new tjc(j, 3, (byte[]) null, (tja) null, new tjb(parcelFileDescriptor));
        }
        if (tjc != null) {
            Map map = this.c;
            uel uel = new uel(onPayloadReceivedParams.a, onPayloadReceivedParams.b.a);
            tje tje = new tje();
            tje.b(onPayloadReceivedParams.b.a);
            map.put(uel, tje.a);
            this.b.a(new uei(onPayloadReceivedParams, tjc));
            return;
        }
        Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", new Object[]{Long.valueOf(onPayloadReceivedParams.b.a)}));
    }

    public final synchronized void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        PayloadTransferUpdate payloadTransferUpdate = onPayloadTransferUpdateParams.b;
        if (payloadTransferUpdate.b == 3) {
            this.c.put(new uel(onPayloadTransferUpdateParams.a, payloadTransferUpdate.a), onPayloadTransferUpdateParams.b);
        } else {
            this.c.remove(new uel(onPayloadTransferUpdateParams.a, payloadTransferUpdate.a));
        }
        this.b.a(new uej(onPayloadTransferUpdateParams));
    }
}
