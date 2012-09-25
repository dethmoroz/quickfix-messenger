/*
 * Copyright (c) 2011, Jan Amoyo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 *
 * - Redistributions of source code must retain the above copyright 
 *   notice, this list of conditions and the following disclaimer.
 * 
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer 
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS 
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED 
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, 
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF 
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH 
 * DAMAGE.
 *
 * MessagesTypeProjectTreeNode.java
 * Sep 24, 2012
 */
package com.jramoyo.qfixmessenger.ui.model;

import com.jramoyo.fix.xml.MessageType;
import com.jramoyo.fix.xml.MessagesType;

/**
 * @author jramoyo
 */
public class MessagesTypeProjectTreeNode extends
		AbstractProjectTreeNode<MessagesType>
{
	private static final long serialVersionUID = -4962240824083476256L;

	public MessagesTypeProjectTreeNode(MessagesType xmlObject)
	{
		super(xmlObject, true);
	}

	@Override
	public String getLabel()
	{
		return "Messages";
	}

	@Override
	protected void populateChildren(MessagesType xmlObject)
	{
		int i = 0;
		for (MessageType child : xmlObject.getMessage())
		{
			insert(new MessageTypeProjectTreeNode(child), i);
			i++;
		}
	}
}
