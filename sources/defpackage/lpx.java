package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.gms.R;
import java.util.Arrays;

/* renamed from: lpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpx extends lny {
    public lqu a;
    public lqs[] b;
    private lqs c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lqu a2 = lqu.a(getArguments().getString("sortType"));
        this.a = a2;
        this.b = a2.h;
        this.c = lqt.a(getArguments().getString("currentSortOption"));
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        iva.a(getActivity() instanceof lpw);
        AlertDialog.Builder title = new AlertDialog.Builder(getActivity()).setTitle(R.string.drive_menu_sort);
        CharSequence[] charSequenceArr = new CharSequence[this.b.length];
        int i = 0;
        while (true) {
            lqs[] lqsArr = this.b;
            if (i >= lqsArr.length) {
                return title.setSingleChoiceItems(charSequenceArr, Arrays.asList(lqsArr).indexOf(this.c), new lpv(this)).create();
            }
            charSequenceArr[i] = getString(lqsArr[i].b());
            i++;
        }
    }
}
