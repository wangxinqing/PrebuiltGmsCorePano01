package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acew extends nis {
    public final acfg a;
    public final absf b;
    public final ParcelFileDescriptor[] c;
    public final abwu d;
    private final DirectTransferConfigurations e;
    private final Handler f;

    public acew(acfg acfg, DirectTransferConfigurations directTransferConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu, absf absf, Handler handler) {
        super(210, "StartDirectTransferOperation");
        this.a = acfg;
        this.b = absf;
        this.e = directTransferConfigurations;
        this.c = parcelFileDescriptorArr;
        this.d = abwu;
        this.f = handler;
    }

    public final void a(Context context) {
        DirectTransferConfigurations directTransferConfigurations = this.e;
        BootstrapConfigurations bootstrapConfigurations = new BootstrapConfigurations();
        HashMap hashMap = new HashMap();
        String str = directTransferConfigurations.a;
        if (str != null) {
            hashMap.put("directTransferConfirmationBodyText", str);
        }
        String str2 = directTransferConfigurations.c;
        if (str2 != null) {
            hashMap.put("directTransferConfirmationTitleText", str2);
        }
        String str3 = directTransferConfigurations.b;
        if (str3 != null) {
            hashMap.put("directTransfer3pConfirmationBodyText", str3);
        }
        bootstrapConfigurations.a((Map) hashMap);
        bootstrapConfigurations.a(new ArrayList(absq.a(context)));
        this.f.post(new acev(this, bootstrapConfigurations));
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
