package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.location.reporting.service.ReportingAndroidChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: ajlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajlp extends irf {
    final /* synthetic */ ReportingAndroidChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajlp(ReportingAndroidChimeraService reportingAndroidChimeraService, Context context) {
        super(context, 22, new int[0]);
        this.a = reportingAndroidChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        String str;
        ReportingAndroidChimeraService reportingAndroidChimeraService = this.a;
        String str2 = getServiceRequest.d;
        Bundle bundle = getServiceRequest.g;
        if (bundle != null) {
            str = bundle.getString("real_client_package_name");
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
        } else {
            str = null;
        }
        isv.a(0, (IBinder) new rmn(reportingAndroidChimeraService, str2, str), (Bundle) null);
    }
}
