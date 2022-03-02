package defpackage;

import android.os.IInterface;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.ConfigUpdateOptions;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface adif extends IInterface {
    void a(adil adil);

    void a(ActivityStatus activityStatus);

    void a(DownloadOptions downloadOptions);

    void a(InstallationOptions installationOptions);

    void a(ifu ifu, ConfigUpdateOptions configUpdateOptions);

    SystemUpdateStatus b();

    void b(adil adil);

    void b(DownloadOptions downloadOptions);

    void b(InstallationOptions installationOptions);

    void c();

    void d();

    void e();

    void f();

    boolean g();

    long h();
}
