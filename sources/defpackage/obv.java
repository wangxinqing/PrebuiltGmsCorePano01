package defpackage;

import android.app.DatePickerDialog;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.DatePicker;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* renamed from: obv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class obv extends TextView implements DatePickerDialog.OnDateSetListener, obm {
    public obv(Activity activity, avnj avnj) {
        super(activity, (AttributeSet) null, 16842881);
        Date date;
        Resources resources = getResources();
        setMinHeight(resources.getDimensionPixelSize(R.dimen.gh_contact_date_min_height));
        setPadding(resources.getDimensionPixelSize(R.dimen.gh_contact_date_start_padding), resources.getDimensionPixelSize(R.dimen.gh_contact_date_padding_top), resources.getDimensionPixelSize(R.dimen.gh_contact_date_end_padding), resources.getDimensionPixelSize(R.dimen.gh_contact_date_padding_bottom));
        setTag(avnj.b);
        if (avnj.g.isEmpty()) {
            date = new Date();
        } else {
            try {
                date = DateFormat.getDateInstance().parse(avnj.g);
            } catch (ParseException e) {
                date = new Date();
            }
        }
        setText(DateFormat.getDateInstance().format(date));
        setTextSize((float) resources.getInteger(R.integer.gh_contact_date_font_size));
        setOnClickListener(new obr(this, avnj, activity));
    }

    public final List aY() {
        return Collections.emptyList();
    }

    public final List c() {
        return Collections.singletonList(oaq.a((String) getTag(), getText().toString()));
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        setText(DateFormat.getDateInstance().format(new GregorianCalendar(i, i2, i3).getTime()));
    }
}
