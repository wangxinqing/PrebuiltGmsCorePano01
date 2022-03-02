package defpackage;

import android.os.IInterface;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: adin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface adin extends IInterface {
    SystemUpdateStatus a();

    void a(adil adil);

    void a(DownloadOptions downloadOptions);

    void a(InstallationOptions installationOptions);

    void b();

    void b(DownloadOptions downloadOptions);

    boolean b(adil adil);
}
