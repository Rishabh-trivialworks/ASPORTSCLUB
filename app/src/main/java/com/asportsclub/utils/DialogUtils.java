package com.asportsclub.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.asportsclub.R;


import java.util.List;

/**
 * Created by MyU10 on 2/3/2017.
 */

public class DialogUtils {

    public static void showBasic(Context context,
                                 String message,
                                 String positiveButtonText,
                                 MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive) {
        new MaterialDialog.Builder(context)
                .content(message)
                .cancelable(false)
                .positiveText(positiveButtonText)
                .onPositive(singleButtonCallbackForPositive)
                .negativeText(R.string.close)
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static MaterialDialog getBasic(Context context,
                                          String message,
                                          String positiveButtonText,
                                          MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive,
                                          String negativeButtonText,
                                          MaterialDialog.SingleButtonCallback singleButtonCallbackForNegative) {
        return new MaterialDialog.Builder(context)
                .content(message)
                .cancelable(false)
                .positiveText(positiveButtonText)
                .onPositive(singleButtonCallbackForPositive)
                .negativeText(negativeButtonText)
                .onNegative(singleButtonCallbackForNegative)
                .build();
    }

    public static MaterialDialog showBasicWithTitle(Context context,
                                                    String title,
                                                    String message,
                                                    String positiveButtonText,
                                                    MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive) {
        return new MaterialDialog.Builder(context)
                .title(title)
                .content(message)
                .cancelable(false)
                .contentGravity(GravityEnum.CENTER)
                .titleGravity(GravityEnum.CENTER)
                .positiveText(positiveButtonText)
                .onPositive(singleButtonCallbackForPositive)
                .negativeText("close")
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static MaterialDialog showBasic(Context context,
                                           String title,
                                           String message,
                                           String positiveButtonText,
                                           MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive) {
        return new MaterialDialog.Builder(context)
                .title(title)
                .content(message)
                .cancelable(false)
                .contentGravity(GravityEnum.CENTER)
                .titleGravity(GravityEnum.CENTER)
                .buttonsGravity(GravityEnum.CENTER)
                .positiveText(positiveButtonText)
                .onPositive(singleButtonCallbackForPositive)
                .show();
    }

    public static void showBasicMessage(Context context,
                                        String title,
                                        String message) {
        new MaterialDialog.Builder(context)
                .title(title)
                .content(message)
                .positiveText("Ok")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static void showBasicMessage(Context context,
                                        String message) {
        new MaterialDialog.Builder(context)
                .content(message)
                .positiveText("Ok")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public static MaterialDialog getBasicMessage(Context context,
                                                 String message) {
        return new MaterialDialog.Builder(context)
                .content(message)
                .positiveText("Ok")
                .onPositive(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                }).build();
    }

    public static MaterialDialog showBasicMessage(Context context,
                                                  String message, MaterialDialog.SingleButtonCallback singleButtonCallback) {
        return new MaterialDialog.Builder(context)
                .content(message)
                .positiveText("Ok")
                .onPositive(singleButtonCallback)
                .show();
    }




    public static void show2OptionsDialog(Context context, String title, String message, String options1, String options2, MaterialDialog.SingleButtonCallback singleButtonCallbackForOptions1, MaterialDialog.SingleButtonCallback singleButtonCallbackForOptions2) {
        new MaterialDialog.Builder(context)
                .content(message)
                .cancelable(false)
                .theme(Theme.LIGHT)
                .title(title)
                .positiveText(options1)
                .negativeText(options2)
                .onPositive(singleButtonCallbackForOptions1)
                .onNegative(singleButtonCallbackForOptions2)
                .show();
    }

    public static void show2OptionsDialog(Context context, String message, String options1, String options2, boolean check, MaterialDialog.SingleButtonCallback singleButtonCallbackForOptions1, MaterialDialog.SingleButtonCallback singleButtonCallbackForOptions2) {
        new MaterialDialog.Builder(context)
                .content(message)
                .cancelable(check)
                .positiveText(options1)
                .negativeText(options2)
                .onPositive(singleButtonCallbackForOptions1)
                .onNegative(singleButtonCallbackForOptions2)
                .show();
    }



    public static void showBasicList(Context context,
                                     String title,
                                     List<String> items,
                                     MaterialDialog.ListCallback listCallback) {
        new MaterialDialog.Builder(context)
                .title(title)
                .items(items)
                .itemsCallback(listCallback)
                .negativeText(context.getString(R.string.close))
                .dividerColorRes(R.color.colorPrimaryDark)
                .itemsGravity(GravityEnum.CENTER)
                .titleGravity(GravityEnum.CENTER)
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

//    public static MaterialDialog showEditInfoDialog(Context context,
//                                                    String title,
//                                                    String positiveButtonText,
//                                                    MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive) {
//        MaterialDialog materialDialog = new MaterialDialog.Builder(context)
//                .title(title)
//                .cancelable(false)
//                .customView(R.layout.dialog_edit_info, false)
//                .positiveText(positiveButtonText)
//                .onPositive(singleButtonCallbackForPositive)
//                .negativeText(R.string.cancel)
//                .onNegative(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
//                        dialog.dismiss();
//                    }
//                })
//                .build();
//        materialDialog.show();
//        return materialDialog;
//    }

//    public static MaterialDialog showEditInfoDialog2Options(Context context,
//                                                            String title,
//                                                            String positiveButtonText,
//                                                            MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive,
//                                                            MaterialDialog.SingleButtonCallback singleButtonCallbackForNegative) {
//        MaterialDialog materialDialog = new MaterialDialog.Builder(context)
//                .title(title)
//                .cancelable(false)
//                .autoDismiss(false)
//                .customView(R.layout.dialog_edit_info, false)
//                .positiveText(positiveButtonText)
//                .onPositive(singleButtonCallbackForPositive)
//                .negativeText(R.string.cancel)
//                .onNegative(singleButtonCallbackForNegative)
//                .build();
//        materialDialog.show();
//        return materialDialog;
//    }

    public static void showBasicwithButton(Context context,
                                           String message,
                                           String positiveButtonText,
                                           MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive
    ) {
        new MaterialDialog.Builder(context)
                .title("Title")
                .content(message)
                .cancelable(false)
                .positiveText(positiveButtonText)
                .onPositive(singleButtonCallbackForPositive)
                .show();
    }

    public static void showBasicwithTwoButton(final Context context,
                                              String title,
                                              String message,
                                              String positiveButtonText,
                                              String NegativeButtonText,
                                              MaterialDialog.SingleButtonCallback singleButtonCallbackForPositive
    ) {
        new MaterialDialog.Builder(context)
                .content(message)
                .theme(Theme.LIGHT)
                .title(title)
                .contentColor(ContextCompat.getColor(context, R.color.black))
                .titleColor(ContextCompat.getColor(context, R.color.black))
                .backgroundColor(ContextCompat.getColor(context, R.color.white))
                .positiveText(positiveButtonText)
                .positiveColor(ContextCompat.getColor(context,R.color.black))
                .negativeColor(ContextCompat.getColor(context,R.color.black))
                .onPositive(singleButtonCallbackForPositive)
                .negativeText(NegativeButtonText)
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }


}
