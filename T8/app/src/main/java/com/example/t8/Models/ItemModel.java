package com.example.t8.Models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class ItemModel implements Parcelable {
    private int id;
    private String name;
    private String description;
    private String createdDate;
    private String createdTime;
    private boolean isEdit;

    public ItemModel() {
    }

    public ItemModel(int id, String name, String description, String createdDate, String createdTime, boolean isEdit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
        this.isEdit = isEdit;
    }

    protected ItemModel(Parcel in) {
        id = in.readInt();
        name = in.readString();
        description = in.readString();
        createdDate = in.readString();
        createdTime = in.readString();
        isEdit = in.readByte() != 0;
    }

    public static final Creator<ItemModel> CREATOR = new Creator<ItemModel>() {
        @Override
        public ItemModel createFromParcel(Parcel in) {
            return new ItemModel(in);
        }

        @Override
        public ItemModel[] newArray(int size) {
            return new ItemModel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public boolean isEdit() {
        return isEdit;
    }

    public void setEdit(boolean edit) {
        isEdit = edit;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(createdDate);
        dest.writeString(createdTime);
        dest.writeByte((byte) (isEdit ? 1 : 0));
    }
}
