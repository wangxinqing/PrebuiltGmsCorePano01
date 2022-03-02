package com.google.android.gms.family.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DateSpinner extends LinearLayout {
    public String a;
    public String b;
    public String c;
    public mhu d;

    public DateSpinner(Context context) {
        super(context);
        c();
    }

    public static final void a(Spinner spinner, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (spinner.getSelectedItem() != null) {
            String valueOf = String.valueOf(spinner.getSelectedItem());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(" ");
            sb.append(valueOf);
            spinner.setContentDescription(sb.toString());
            return;
        }
        spinner.setContentDescription(str);
    }

    private final void c() {
        inflate(getContext(), R.layout.fm_layout_date_spinner, this);
        Map<String, Integer> displayNames = GregorianCalendar.getInstance().getDisplayNames(2, 1, ihs.b().getResources().getConfiguration().locale);
        HashMap hashMap = new HashMap(displayNames.size());
        for (Map.Entry next : displayNames.entrySet()) {
            hashMap.put((Integer) next.getValue(), (String) next.getKey());
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (int i = 0; i < hashMap.size(); i++) {
            arrayList.add((String) hashMap.get(Integer.valueOf(i)));
        }
        mra mra = new mra(getContext(), "", arrayList);
        mra.setDropDownViewResource(R.layout.fm_date_spinner_dropdown);
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        spinner.setAdapter(mra);
        spinner.setOnItemSelectedListener(new mqx(this, spinner));
        mrb mrb = new mrb(getContext(), "");
        mrb.c = R.layout.fm_date_spinner_dropdown;
        Spinner spinner2 = (Spinner) findViewById(R.id.fm_birthday_day);
        spinner2.setAdapter(mrb);
        spinner2.setOnItemSelectedListener(new mqy(this, spinner2));
        EditText editText = (EditText) findViewById(R.id.fm_birthday_year);
        editText.addTextChangedListener(new mqz(this, editText));
    }

    public final Calendar b() {
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        Spinner spinner2 = (Spinner) findViewById(R.id.fm_birthday_day);
        EditText editText = (EditText) findViewById(R.id.fm_birthday_year);
        if (spinner.getSelectedItem() == null || spinner2.getSelectedItem() == null || TextUtils.isEmpty(editText.getText())) {
            return null;
        }
        return new GregorianCalendar(Integer.parseInt(editText.getText().toString()), spinner.getSelectedItemPosition() - 1, ((Integer) spinner2.getSelectedItem()).intValue());
    }

    public DateSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public DateSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public final void a() {
        int i;
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        EditText editText = (EditText) findViewById(R.id.fm_birthday_year);
        Spinner spinner2 = (Spinner) findViewById(R.id.fm_birthday_day);
        if (spinner.getSelectedItem() != null || !TextUtils.isEmpty(editText.getText())) {
            if (!TextUtils.isEmpty(editText.getText())) {
                i = Integer.parseInt(editText.getText().toString());
            } else {
                i = 2016;
            }
            int actualMaximum = new GregorianCalendar(i, spinner.getSelectedItemPosition() - 1, 1).getActualMaximum(5);
            if (spinner2.getSelectedItem() != null && actualMaximum < ((Integer) spinner2.getSelectedItem()).intValue()) {
                spinner2.setSelection(0, true);
            }
            ((mrb) spinner2.getAdapter()).b = actualMaximum;
        }
    }

    public final void b(int i) {
        int i2 = i + 1;
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_month);
        if (i2 < spinner.getAdapter().getCount()) {
            spinner.setSelection(i2);
        }
    }

    public final void a(int i) {
        Spinner spinner = (Spinner) findViewById(R.id.fm_birthday_day);
        if (i < spinner.getAdapter().getCount()) {
            spinner.setSelection(i);
        }
    }
}
