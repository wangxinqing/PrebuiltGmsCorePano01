package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.gms.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DatePicker extends alo {
    public static final int[] g = {5, 2, 1};
    public int a;
    public int b;
    public int c;
    public Calendar d;
    public Calendar e;
    public Calendar f;
    private String p;
    private alp q;
    private alp r;
    private alp s;
    private final DateFormat t;
    private alq u;
    private Calendar v;

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    public static boolean a(alp alp, int i) {
        if (i == alp.b) {
            return false;
        }
        alp.b = i;
        return true;
    }

    private final void b() {
        post(new alk(this));
    }

    public static boolean b(alp alp, int i) {
        if (i == alp.c) {
            return false;
        }
        alp.c = i;
        return true;
    }

    /* JADX INFO: finally extract failed */
    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        String str = "MM/dd/yyyy";
        this.t = new SimpleDateFormat(str);
        Locale locale = Locale.getDefault();
        getContext().getResources();
        alq a2 = alr.a(locale);
        this.u = a2;
        this.v = alr.a(this.v, a2.a);
        this.d = alr.a(this.d, this.u.a);
        this.e = alr.a(this.e, this.u.a);
        this.f = alr.a(this.f, this.u.a);
        alp alp = this.q;
        if (alp != null) {
            alp.d = this.u.b;
            a(this.a, alp);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.d);
        qb.a(this, context, ait.d, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(0);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            this.v.clear();
            if (TextUtils.isEmpty(string)) {
                this.v.set(1900, 0, 1);
            } else if (!a(string, this.v)) {
                this.v.set(1900, 0, 1);
            }
            this.d.setTimeInMillis(this.v.getTimeInMillis());
            this.v.clear();
            if (TextUtils.isEmpty(string2)) {
                this.v.set(2100, 0, 1);
            } else if (!a(string2, this.v)) {
                this.v.set(2100, 0, 1);
            }
            this.e.setTimeInMillis(this.v.getTimeInMillis());
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3;
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(getContext())) : string3;
            if (!TextUtils.equals(this.p, string3)) {
                this.p = string3;
                String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(this.u.a, string3);
                str = !TextUtils.isEmpty(bestDateTimePattern) ? bestDateTimePattern : str;
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
                char c2 = 0;
                boolean z = false;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (charAt != ' ') {
                        if (charAt != '\'') {
                            if (z) {
                                sb.append(charAt);
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= 6) {
                                        sb.append(charAt);
                                        break;
                                    } else if (charAt != cArr[i4]) {
                                        i4++;
                                    } else if (charAt != c2) {
                                        arrayList.add(sb.toString());
                                        sb.setLength(0);
                                    }
                                }
                            }
                            c2 = charAt;
                        } else if (!z) {
                            sb.setLength(0);
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                arrayList.add(sb.toString());
                if (arrayList.size() == string3.length() + 1) {
                    this.l.clear();
                    this.l.addAll(arrayList);
                    this.r = null;
                    this.q = null;
                    this.s = null;
                    this.a = -1;
                    this.b = -1;
                    this.c = -1;
                    String upperCase = string3.toUpperCase();
                    ArrayList arrayList2 = new ArrayList(3);
                    for (int i5 = 0; i5 < upperCase.length(); i5++) {
                        char charAt2 = upperCase.charAt(i5);
                        if (charAt2 != 'D') {
                            if (charAt2 != 'M') {
                                if (charAt2 != 'Y') {
                                    throw new IllegalArgumentException("datePicker format error");
                                } else if (this.s == null) {
                                    alp alp2 = new alp();
                                    this.s = alp2;
                                    arrayList2.add(alp2);
                                    this.c = i5;
                                    this.s.e = "%d";
                                } else {
                                    throw new IllegalArgumentException("datePicker format error");
                                }
                            } else if (this.q == null) {
                                alp alp3 = new alp();
                                this.q = alp3;
                                arrayList2.add(alp3);
                                this.q.d = this.u.b;
                                this.a = i5;
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else if (this.r == null) {
                            alp alp4 = new alp();
                            this.r = alp4;
                            arrayList2.add(alp4);
                            this.r.e = "%02d";
                            this.b = i5;
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    }
                    if (this.l.size() != 0) {
                        if (this.l.size() == 1) {
                            CharSequence charSequence = (CharSequence) this.l.get(0);
                            this.l.clear();
                            this.l.add("");
                            for (int i6 = 0; i6 < arrayList2.size() - 1; i6++) {
                                this.l.add(charSequence);
                            }
                            this.l.add("");
                        } else if (this.l.size() != arrayList2.size() + 1) {
                            throw new IllegalStateException("Separators size: " + this.l.size() + " mustequal the size of columns: " + arrayList2.size() + " + 1");
                        }
                        this.i.clear();
                        this.h.removeAllViews();
                        this.j = new ArrayList(arrayList2);
                        if (this.k > this.j.size() - 1) {
                            this.k = this.j.size() - 1;
                        }
                        LayoutInflater from = LayoutInflater.from(getContext());
                        int a3 = a();
                        if (!TextUtils.isEmpty((CharSequence) this.l.get(0))) {
                            TextView textView = (TextView) from.inflate(R.layout.lb_picker_separator, this.h, false);
                            textView.setText((CharSequence) this.l.get(0));
                            this.h.addView(textView);
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                        while (i2 < a3) {
                            VerticalGridView verticalGridView = (VerticalGridView) from.inflate(R.layout.lb_picker_column, this.h, false);
                            super.a(verticalGridView);
                            verticalGridView.a.L.d.e = 0;
                            verticalGridView.requestLayout();
                            verticalGridView.setHasFixedSize(false);
                            verticalGridView.setFocusable(isActivated());
                            verticalGridView.setItemViewCacheSize(0);
                            this.i.add(verticalGridView);
                            this.h.addView(verticalGridView);
                            int i7 = i2 + 1;
                            if (!TextUtils.isEmpty((CharSequence) this.l.get(i7))) {
                                TextView textView2 = (TextView) from.inflate(R.layout.lb_picker_separator, this.h, false);
                                textView2.setText((CharSequence) this.l.get(i7));
                                this.h.addView(textView2);
                            }
                            verticalGridView.setAdapter(new alm(this, this.m, this.n, i2));
                            akj akj = this.o;
                            akb akb = verticalGridView.a;
                            if (akj != null) {
                                ArrayList arrayList3 = akb.l;
                                if (arrayList3 == null) {
                                    akb.l = new ArrayList();
                                } else {
                                    arrayList3.clear();
                                }
                                akb.l.add(akj);
                            } else {
                                akb.l = null;
                            }
                            i2 = i7;
                        }
                        b();
                        return;
                    }
                    throw new IllegalStateException("Separators size is: " + this.l.size() + ". At least one separator must be provided");
                }
                throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + string3.length() + " + 1");
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final boolean a(String str, Calendar calendar) {
        try {
            calendar.setTime(this.t.parse(str));
            return true;
        } catch (ParseException e2) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    public final void a(int i, int i2) {
        this.v.setTimeInMillis(this.f.getTimeInMillis());
        int i3 = a(i).a;
        if (i == this.b) {
            this.v.add(5, i2 - i3);
        } else if (i == this.a) {
            this.v.add(2, i2 - i3);
        } else if (i == this.c) {
            this.v.add(1, i2 - i3);
        } else {
            throw new IllegalArgumentException();
        }
        int i4 = this.v.get(1);
        int i5 = this.v.get(2);
        int i6 = this.v.get(5);
        if (this.f.get(1) != i4 || this.f.get(2) != i6 || this.f.get(5) != i5) {
            this.f.set(i4, i5, i6);
            if (this.f.before(this.d)) {
                this.f.setTimeInMillis(this.d.getTimeInMillis());
            } else if (this.f.after(this.e)) {
                this.f.setTimeInMillis(this.e.getTimeInMillis());
            }
            b();
        }
    }
}
