package defpackage;

import android.view.View;
import com.google.android.gms.R;

/* renamed from: lof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lof implements View.OnClickListener {
    private final loj a;

    public lof(loj loj) {
        this.a = loj;
    }

    public void onClick(View view) {
        loj loj = this.a;
        int id = view.getId();
        if (id == R.id.drive_button_bar_button_right) {
            if (!loj.k) {
                loj.k = true;
                loj.c.b(lce.Q, loj.j.getText().toString());
                new loi(loj).execute(new Void[0]);
            }
        } else if (id != R.id.drive_button_bar_button_left) {
            loj.a.b("CreateFileDialogFragmen", "Unknown view clicked: %s, %s.", Integer.valueOf(id), view);
        } else {
            loj.getActivity().setResult(0);
            loj.getActivity().finish();
            loj.a(1);
        }
    }
}
