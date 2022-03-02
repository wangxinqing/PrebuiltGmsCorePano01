package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, xi {
    public ww a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private final void a(View view) {
        a(view, -1);
    }

    private final LayoutInflater c() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    public final ww a() {
        return this.a;
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        qb.a((View) this, this.m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.h = textView;
        int i2 = this.n;
        if (i2 != -1) {
            textView.setTextAppearance(this.o, i2);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i2, i3);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        aev a2 = aev.a(getContext(), attributeSet, uh.s, i2, 0);
        this.m = a2.a(5);
        this.n = a2.f(1, -1);
        this.c = a2.a(7, false);
        this.o = context;
        this.p = a2.a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        a2.a();
        obtainStyledAttributes.recycle();
    }

    private final void a(View view, int i2) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    public final void a(ww wwVar) {
        int i2;
        int i3;
        ImageView imageView;
        String str;
        int i4;
        RadioButton radioButton;
        CheckBox checkBox;
        CompoundButton compoundButton;
        this.a = wwVar;
        int i5 = 0;
        if (!wwVar.isVisible()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        setVisibility(i2);
        CharSequence a2 = wwVar.a((xi) this);
        if (a2 != null) {
            this.h.setText(a2);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = wwVar.isCheckable();
        if (!(!isCheckable && this.g == null && this.i == null)) {
            if (this.a.e()) {
                if (this.g == null) {
                    RadioButton radioButton2 = (RadioButton) c().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.g = radioButton2;
                    a((View) radioButton2);
                }
                CompoundButton compoundButton2 = this.g;
                checkBox = this.i;
                radioButton = checkBox;
                compoundButton = compoundButton2;
            } else {
                if (this.i == null) {
                    CheckBox checkBox2 = (CheckBox) c().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.i = checkBox2;
                    a((View) checkBox2);
                }
                CompoundButton compoundButton3 = this.i;
                radioButton = this.g;
                checkBox = compoundButton3;
                compoundButton = compoundButton3;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (!(radioButton == null || radioButton.getVisibility() == 8)) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton3 = this.g;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean d2 = wwVar.d();
        wwVar.c();
        if (!d2 || !this.a.d()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            TextView textView = this.j;
            ww wwVar2 = this.a;
            char c2 = wwVar2.c();
            if (c2 != 0) {
                Resources resources = wwVar2.i.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(wwVar2.i.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                if (wwVar2.i.c()) {
                    i4 = wwVar2.h;
                } else {
                    i4 = wwVar2.f;
                }
                ww.a(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                ww.a(sb, i4, FragmentTransaction.TRANSIT_ENTER_MASK, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                ww.a(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                ww.a(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                ww.a(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                ww.a(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c2 == 8) {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == 10) {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            } else {
                str = "";
            }
            textView.setText(str);
        }
        if (this.j.getVisibility() != i3) {
            this.j.setVisibility(i3);
        }
        Drawable icon = wwVar.getIcon();
        boolean z = this.e;
        if ((z || this.c) && !((imageView = this.f) == null && icon == null && !this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) c().inflate(R.layout.abc_list_menu_item_icon, this, false);
                this.f = imageView2;
                a(imageView2, 0);
            }
            if (icon == null && !this.c) {
                this.f.setVisibility(8);
            } else {
                ImageView imageView3 = this.f;
                if (!z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            }
        }
        setEnabled(wwVar.isEnabled());
        boolean hasSubMenu = wwVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            if (!hasSubMenu) {
                i5 = 8;
            }
            imageView4.setVisibility(i5);
        }
        setContentDescription(wwVar.k);
    }
}
