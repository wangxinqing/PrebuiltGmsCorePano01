package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.drive.ui.select.SelectFileChimeraActivity;

/* renamed from: log  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class log implements View.OnClickListener {
    private final loj a;

    public log(loj loj) {
        this.a = loj;
    }

    public void onClick(View view) {
        loj loj = this.a;
        lpd a2 = SelectFileChimeraActivity.a(loj.getActivity(), loj.f, loj.g, loj.h);
        a2.a(lim.a(liu.b, (Object) "application/vnd.google-apps.folder"));
        a2.a(loj.b);
        a2.a(loj.getString(R.string.drive_create_file_pick_folder_dialog_title));
        a2.a(false);
        loj.startActivityForResult(a2.a, 0);
    }
}
