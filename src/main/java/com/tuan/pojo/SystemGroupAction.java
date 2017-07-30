package com.tuan.pojo;

public class SystemGroupAction {
    private Integer id;

    private Integer groupId;

    private Integer actionId;

    public SystemGroupAction(Integer id, Integer groupId, Integer actionId) {
        this.id = id;
        this.groupId = groupId;
        this.actionId = actionId;
    }

    public SystemGroupAction() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }
}