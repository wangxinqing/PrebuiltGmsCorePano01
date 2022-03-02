package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: ajvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajvl extends gc {
    public final LinkedHashSet ag = new LinkedHashSet();
    public final LinkedHashSet ah = new LinkedHashSet();
    public DateSelector ai;
    public CheckableImageButton aj;
    public Button ak;
    private final LinkedHashSet al = new LinkedHashSet();
    private final LinkedHashSet am = new LinkedHashSet();
    private int an;
    private ajvv ao;
    private CalendarConstraints ap;
    private ajvf aq;
    private int ar;
    private CharSequence as;
    private boolean at;
    private int au;
    private TextView av;
    private ajzf aw;

    public static boolean a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ajyl.a(context, (int) R.attr.materialCalendarStyle, ajvf.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private static int b(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = Month.a().e;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private final int l() {
        int i = this.an;
        return i == 0 ? this.ai.e() : i;
    }

    public final void j() {
        String f = this.ai.f();
        this.av.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), new Object[]{f}));
        this.av.setText(f);
    }

    public final void k() {
        ajvv ajvv;
        DateSelector dateSelector = this.ai;
        requireContext();
        int l = l();
        CalendarConstraints calendarConstraints = this.ap;
        ajvf ajvf = new ajvf();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", l);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.c);
        ajvf.setArguments(bundle);
        this.aq = ajvf;
        if (this.aj.a) {
            DateSelector dateSelector2 = this.ai;
            CalendarConstraints calendarConstraints2 = this.ap;
            ajvv = new ajvo();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            ajvv.setArguments(bundle2);
        } else {
            ajvv = this.aq;
        }
        this.ao = ajvv;
        j();
        ht a = getChildFragmentManager().a();
        a.a((int) R.id.mtrl_calendar_frame, (gj) this.ao);
        a.h();
        ajvv ajvv2 = this.ao;
        ajvv2.i.add(new ajvj(this));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.al.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.an = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.ai = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.ap = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.ar = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.as = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.au = bundle.getInt("INPUT_MODE_KEY");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        Dialog dialog = new Dialog(requireContext, l());
        Context context = dialog.getContext();
        this.at = a(context);
        int a = ajyl.a(context, (int) R.attr.colorSurface, ajvl.class.getCanonicalName());
        ajzf ajzf = new ajzf(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2132019047);
        this.aw = ajzf;
        ajzf.a(context);
        this.aw.c(ColorStateList.valueOf(a));
        this.aw.d(qb.o(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z;
        if (!this.at) {
            i = R.layout.mtrl_picker_dialog;
        } else {
            i = R.layout.mtrl_picker_fullscreen;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.at) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(b(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(b(context), -1));
            Resources resources = requireContext().getResources();
            findViewById2.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (ajvq.a * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((ajvq.a - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.av = textView;
        qb.f(textView, 1);
        this.aj = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.as;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.ar);
        }
        this.aj.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.aj;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, uj.b(context, R.drawable.ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], uj.b(context, R.drawable.ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.aj;
        if (this.au != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        qb.a((View) this.aj, (oz) null);
        a(this.aj);
        this.aj.setOnClickListener(new ajvk(this));
        this.ak = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.ai.b()) {
            this.ak.setEnabled(true);
        } else {
            this.ak.setEnabled(false);
        }
        this.ak.setTag("CONFIRM_BUTTON_TAG");
        this.ak.setOnClickListener(new ajvh(this));
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new ajvi(this));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.am.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.an);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.ai);
        ajuq ajuq = new ajuq(this.ap);
        Month month = this.aq.c;
        if (month != null) {
            ajuq.e = Long.valueOf(month.g);
        }
        if (ajuq.e == null) {
            long j = Month.a().g;
            long j2 = ajuq.c;
            if (j2 > j || j > ajuq.d) {
                j = j2;
            }
            ajuq.e = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", ajuq.f);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(Month.a(ajuq.c), Month.a(ajuq.d), Month.a(ajuq.e.longValue()), (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY")));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.ar);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.as);
    }

    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.at) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.aw);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.aw, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ajwd(requireDialog(), rect));
        }
        k();
    }

    public final void onStop() {
        this.ao.i.clear();
        super.onStop();
    }

    public final void a(CheckableImageButton checkableImageButton) {
        String str;
        if (this.aj.a) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.aj.setContentDescription(str);
    }
}
