package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: ohh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ohh extends BaseAdapter {
    public String a = null;
    public List b = null;
    private final HelpChimeraActivity c;

    public ohh(HelpChimeraActivity helpChimeraActivity) {
        this.c = helpChimeraActivity;
    }

    public final int getCount() {
        List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final Object getItem(int i) {
        return this.b.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        oab oab = (oab) this.b.get(i);
        View a2 = oae.a(this.c, oab, (View.OnClickListener) new oac(this.c, oab, i, 7, this.a), (int) R.layout.gh_help_content_line_item, true);
        if (a2 != null) {
            return a2;
        }
        View view2 = new View(this.c);
        view2.setVisibility(8);
        return view2;
    }
}
