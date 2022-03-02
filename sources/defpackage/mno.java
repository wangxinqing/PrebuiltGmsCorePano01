package defpackage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.manage.DeleteMemberChimeraActivity;

/* renamed from: mno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mno implements LoaderManager.LoaderCallbacks {
    final /* synthetic */ DeleteMemberChimeraActivity a;

    public mno(DeleteMemberChimeraActivity deleteMemberChimeraActivity) {
        this.a = deleteMemberChimeraActivity;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        DeleteMemberChimeraActivity deleteMemberChimeraActivity = this.a;
        return new mpn(deleteMemberChimeraActivity, deleteMemberChimeraActivity.b, deleteMemberChimeraActivity.h, deleteMemberChimeraActivity.a, deleteMemberChimeraActivity.c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Boolean bool = (Boolean) obj;
        DeleteMemberChimeraActivity deleteMemberChimeraActivity = this.a;
        deleteMemberChimeraActivity.f = false;
        ProgressDialog progressDialog = deleteMemberChimeraActivity.g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.a.g = null;
        }
        String valueOf = String.valueOf(bool);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Delete member loader result received, value = ");
        sb.append(valueOf);
        mfv.c("DeleteMemberActivity", sb.toString(), new Object[0]);
        if (bool.booleanValue()) {
            DeleteMemberChimeraActivity deleteMemberChimeraActivity2 = this.a;
            if (!deleteMemberChimeraActivity2.e) {
                deleteMemberChimeraActivity2.i.a(9);
                Toast.makeText(deleteMemberChimeraActivity2, deleteMemberChimeraActivity2.getResources().getString(R.string.fm_member_delete_successful_message, new Object[]{deleteMemberChimeraActivity2.d}), 0).show();
                Intent intent = new Intent();
                deleteMemberChimeraActivity2.b(intent);
                deleteMemberChimeraActivity2.setResult(6, intent);
                deleteMemberChimeraActivity2.finish();
            } else {
                deleteMemberChimeraActivity2.i.a(18);
                Toast.makeText(deleteMemberChimeraActivity2, R.string.fm_leave_family_successful_message, 0).show();
                Intent intent2 = new Intent();
                deleteMemberChimeraActivity2.b(intent2);
                deleteMemberChimeraActivity2.setResult(9, intent2);
                deleteMemberChimeraActivity2.finish();
            }
        } else {
            DeleteMemberChimeraActivity deleteMemberChimeraActivity3 = this.a;
            if (!deleteMemberChimeraActivity3.e) {
                Toast.makeText(deleteMemberChimeraActivity3, deleteMemberChimeraActivity3.getResources().getString(R.string.fm_member_delete_error_message, new Object[]{deleteMemberChimeraActivity3.d}), 0).show();
            } else {
                Toast.makeText(deleteMemberChimeraActivity3, R.string.fm_leave_family_error_message, 0).show();
            }
        }
        this.a.getSupportLoaderManager().destroyLoader(0);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
