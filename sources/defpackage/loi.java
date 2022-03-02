package defpackage;

import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: loi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class loi extends AsyncTask {
    private final WeakReference a;

    public loi(loj loj) {
        this.a = new WeakReference(loj);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        loj loj = (loj) this.a.get();
        DriveId driveId = null;
        if (loj != null) {
            Intent intent = loj.getActivity().getIntent();
            String stringExtra = intent.getStringExtra("callerPackageName");
            String stringExtra2 = intent.getStringExtra("accountName");
            ibz ibz = new ibz(loj.getActivity());
            ibq ibq = jzf.d;
            jzd jzd = new jzd();
            jzd.a.putInt("proxy_type", 2);
            ibz.a(ibq, (ibj) jzd.a());
            ibz.b = stringExtra;
            ibz.a(intent.getStringArrayExtra("clientScopes"));
            ibz.a(stringExtra2);
            icc b = ibz.b();
            if (b.a(5, TimeUnit.SECONDS).b()) {
                try {
                    DriveId driveId2 = loj.b;
                    jzv jzv = new jzv(loj.c);
                    int i = loj.e;
                    icc icc = b;
                    kuq kuq = (kuq) b.b((idf) new kur(icc, new jzv(jzv.a), driveId2, loj.d, i)).a();
                    Status status = kuq.a;
                    loj.a.a("createFileFromUi completed with status %s", status);
                    if (status.c()) {
                        driveId = kuq.b;
                    }
                } finally {
                    b.g();
                }
            }
        }
        return driveId;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        DriveId driveId = (DriveId) obj;
        loj loj = (loj) this.a.get();
        if (loj == null) {
            return;
        }
        if (driveId == null) {
            Activity activity = loj.getActivity();
            if (activity != null) {
                activity.setResult(0);
                activity.finish();
            }
            loj.a(3);
            loj.k = false;
            return;
        }
        Activity activity2 = loj.getActivity();
        if (activity2 != null) {
            Intent intent = new Intent();
            intent.putExtra("response_drive_id", driveId);
            activity2.setResult(-1, intent);
            activity2.finish();
        }
        loj.a(0);
        loj.k = false;
    }
}
