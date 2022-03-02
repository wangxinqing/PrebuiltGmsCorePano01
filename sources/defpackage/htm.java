package defpackage;

import android.content.Context;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.clearcut.uploader.QosUploaderChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: htm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class htm extends nis {
    private final hsx a;
    private final String b;

    public htm(hsx hsx, String str) {
        super(40, "ForceUploadOperation");
        this.a = hsx;
        this.b = str;
    }

    public final void a(Context context) {
        if (ClearcutLoggerChimeraService.a(this.b)) {
            QosUploaderChimeraService qosUploaderChimeraService = new QosUploaderChimeraService();
            qosUploaderChimeraService.a(context);
            try {
                this.a.b(!qosUploaderChimeraService.a("qos_debug_force_upload") ? Status.c : Status.a);
            } finally {
                qosUploaderChimeraService.b();
            }
        } else {
            throw new nja(31001, "Debug operation disallowed");
        }
    }

    public final void a(Status status) {
        this.a.b(status);
    }
}
