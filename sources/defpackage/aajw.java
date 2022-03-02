package defpackage;

import android.os.IInterface;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: aajw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aajw extends IInterface {
    void a(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response);

    void a(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response);

    void a(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response);

    void a(SetExperimentIdsCall$Response setExperimentIdsCall$Response);

    void a(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response);
}
