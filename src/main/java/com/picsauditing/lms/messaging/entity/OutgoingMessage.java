package com.picsauditing.lms.messaging.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "outgoing_message")
public class OutgoingMessage extends Message {

}
